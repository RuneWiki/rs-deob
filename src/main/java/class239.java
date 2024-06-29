import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class239 implements Runnable {

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Z")
    private boolean field3978 = false;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Z")
    private boolean field3990 = false;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    private int field3991 = 0;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    private int field3980 = 0;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field3988;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "Lfk;")
    private class40 field3996;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Ljava/io/InputStream;")
    private InputStream field3982;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3979;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "[[I")
    public static int[][] field3983 = new int[104][104];

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field3984 = -1;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lhd;")
    public static class113 field3987 = new class113(0, 0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Ltj;")
    private class169 field3992;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "Lfj;")
    public static class228 field3997;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "[B")
    private byte[] field3993;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILdl;)V", line = 11)
    public static final void method1649(int arg0, class34 arg1) {
        if (arg0 != 104) {
            method1649(118, (class34) null);
        }
        class232.field3852 = arg1;
        field3974++;
    }

    @OriginalMember(owner = "client!tk", name = "run", descriptor = "()V", line = 22)
    public final void run() {
        field3973++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3991 == this.field3980) {
                        if (this.field3978) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    var3 = this.field3980;
                    if (this.field3980 > this.field3991) {
                        var4 = 5000 - this.field3980;
                    } else {
                        var4 = this.field3991 - this.field3980;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field3979.write(this.field3993, var3, var4);
                    } catch (IOException var12) {
                        this.field3990 = true;
                    }
                    this.field3980 = (this.field3980 + var4) % 5000;
                    try {
                        if (this.field3991 == this.field3980) {
                            this.field3979.flush();
                        }
                    } catch (IOException var11) {
                        this.field3990 = true;
                    }
                }
            }
            try {
                if (this.field3982 != null) {
                    this.field3982.close();
                }
                if (this.field3979 != null) {
                    this.field3979.close();
                }
                if (this.field3988 != null) {
                    this.field3988.close();
                }
            } catch (IOException var10) {
            }
            this.field3993 = null;
        } catch (Exception var15) {
            class195.method1393(var15, 0, (String) null);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 93)
    public final void method1650(byte arg0) {
        field3977++;
        if (this.field3978) {
            return;
        }
        synchronized (this) {
            this.field3978 = true;
            this.notifyAll();
        }
        if (this.field3992 != null) {
            while (this.field3992.field2833 == 0) {
                class137.method1027(1L, 0);
            }
            if (this.field3992.field2833 == 1) {
                try {
                    ((Thread) this.field3992.field2832).join();
                } catch (InterruptedException var6) {
                }
            }
        }
        int var5 = -84 % ((-arg0 - 55) / 39);
        this.field3992 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BII)V", line = 130)
    public final void method1651(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3975++;
        if (this.field3978 || arg2 != -1) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field3982.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg0 -= var5;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)I", line = 162)
    public final int method1652(int arg0) throws IOException {
        field3994++;
        if (this.field3978) {
            return 0;
        } else {
            if (arg0 != -13301) {
                method1649(-33, (class34) null);
            }
            return this.field3982.available();
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/net/Socket;Lfk;)V", line = 786)
    public class239(Socket arg0, class40 arg1) throws IOException {
        this.field3988 = arg0;
        this.field3996 = arg1;
        this.field3988.setSoTimeout(30000);
        this.field3988.setTcpNoDelay(true);
        this.field3982 = this.field3988.getInputStream();
        this.field3979 = this.field3988.getOutputStream();
    }

    @OriginalMember(owner = "client!tk", name = "finalize", descriptor = "()V", line = 183)
    protected final void finalize() {
        this.method1650((byte) 63);
        field3989++;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BBI)V", line = 191)
    public final void method1653(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field3986++;
        if (this.field3978) {
            return;
        }
        if (this.field3990) {
            this.field3990 = false;
            throw new IOException();
        }
        if (this.field3993 == null) {
            this.field3993 = new byte[5000];
        }
        synchronized (this) {
            int var6 = -56 % ((2 - arg2) / 33);
            for (int var7 = 0; var7 < arg3; var7++) {
                this.field3993[this.field3991] = arg1[arg0 + var7];
                this.field3991 = (this.field3991 + 1) % 5000;
                if (((this.field3980 + 4900) % 5000) == this.field3991) {
                    throw new IOException();
                }
            }
            if (this.field3992 == null) {
                this.field3992 = this.field3996.method241(8851, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 243)
    public static final void method1654(int arg0) {
        class111.method849(false, (byte) 81);
        class90.field1532 = 0;
        boolean var1 = true;
        field3981++;
        for (int var2 = 0; var2 < class244.field4113.length; var2++) {
            if (class223.field3747[var2] != -1 && class244.field4113[var2] == null) {
                class244.field4113[var2] = class174.field2883.method636(class223.field3747[var2], (byte) 66, 0);
                if (class244.field4113[var2] == null) {
                    var1 = false;
                    class90.field1532++;
                }
            }
            if (class72.field1192[var2] != -1 && class149.field2511[var2] == null) {
                class149.field2511[var2] = class174.field2883.method630((byte) -45, 0, class229.field3799[var2], class72.field1192[var2]);
                if (class149.field2511[var2] == null) {
                    var1 = false;
                    class90.field1532++;
                }
            }
            if (class281.field4827) {
                if (class50.field756[var2] != -1 && class249.field4164[var2] == null) {
                    class249.field4164[var2] = class174.field2883.method636(class50.field756[var2], (byte) 81, 0);
                    if (class249.field4164[var2] == null) {
                        class90.field1532++;
                        var1 = false;
                    }
                }
                if (class288.field4957[var2] != -1 && class222.field3737[var2] == null) {
                    class222.field3737[var2] = class174.field2883.method636(class288.field4957[var2], (byte) 84, 0);
                    if (class222.field3737[var2] == null) {
                        class90.field1532++;
                        var1 = false;
                    }
                }
            }
            if (class53.field836 != null && class236.field3923[var2] == null && class53.field836[var2] != -1) {
                class236.field3923[var2] = class174.field2883.method630((byte) 114, 0, class229.field3799[var2], class53.field836[var2]);
                if (class236.field3923[var2] == null) {
                    class90.field1532++;
                    var1 = false;
                }
            }
        }
        if (class144.field2407 == null || !class159.field2686.method610(-29242, class3.method14(new class255[] { class144.field2407.field1568, class82.field1327 }, (byte) -114))) {
            class160.field2696 = null;
        } else if (class159.field2686.method629(class3.method14(new class255[] { class144.field2407.field1568, class82.field1327 }, (byte) -71), 19531)) {
            class160.field2696 = class315.method2176((byte) -45, class3.method14(new class255[] { class144.field2407.field1568, class82.field1327 }, (byte) -52), class159.field2686);
        } else {
            var1 = false;
            class90.field1532++;
        }
        if (!var1) {
            class232.field3851 = 1;
            return;
        }
        class242.field4082 = 0;
        boolean var3 = true;
        int var4 = 0;
        if (arg0 != 22121) {
            return;
        }
        while (var4 < class244.field4113.length) {
            byte[] var5 = class149.field2511[var4];
            if (var5 != null) {
                int var6 = (class116.field1976[var4] & 0xFF) * 64 - class268.field4615;
                int var7 = (class116.field1976[var4] >> 8) * 64 - class197.field3355;
                if (class250.field4221) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class313.method2161(var7, var6, var5, (byte) 76);
            }
            if (class281.field4827) {
                byte[] var8 = class222.field3737[var4];
                if (var8 != null) {
                    int var9 = (class116.field1976[var4] & 0xFF) * 64 - class268.field4615;
                    int var10 = (class116.field1976[var4] >> 8) * 64 - class197.field3355;
                    if (class250.field4221) {
                        var10 = 10;
                        var9 = 10;
                    }
                    var3 &= class313.method2161(var10, var9, var8, (byte) 49);
                }
            }
            var4++;
        }
        if (!var3) {
            class232.field3851 = 2;
            return;
        }
        if (class232.field3851 != 0) {
            class256.method1796(class3.method14(new class255[] { class241.field4009, class137.field2298 }, (byte) -67), -8921, true);
        }
        boolean var11 = false;
        class118.method885(true);
        class196.method1402(695633762);
        if (class281.field4827 && class258.field4390) {
            for (int var12 = 0; var12 < class244.field4113.length; var12++) {
                if (class222.field3737[var12] != null || class249.field4164[var12] != null) {
                    var11 = true;
                    break;
                }
            }
        }
        class74.method532(4, 104, 104, class281.field4827 ? 28 : 25, var11);
        for (int var13 = 0; var13 < 4; var13++) {
            class310.field5292[var13].method1177((byte) -43);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class166.field2800[var14][var15][var16] = 0;
                }
            }
        }
        class121.method900(false, 0);
        if (class281.field4827) {
            class35.field560.method1909();
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    class35.field558[var17][var18].field4639 = true;
                }
            }
        }
        if (class281.field4827) {
            class164.method1208();
        }
        if (class281.field4827) {
            class167.method1213(16777215);
        }
        class118.method885(true);
        System.gc();
        class111.method849(true, (byte) 117);
        class47.method285(false, arg0 - 238);
        if (!class250.field4221) {
            class92.method688(false, 1);
            class111.method849(true, (byte) 88);
            if (class281.field4827) {
                int var19 = class276.field4742.field5125[0] >> 3;
                int var20 = class276.field4742.field5154[0] >> 3;
                class133.method997(var20, (byte) -96, var19);
            }
            class296.method2084((byte) 94, false);
            if (class236.field3923 != null) {
                class60.method375((byte) 121);
            }
        }
        if (class250.field4221) {
            class215.method1531(false, -1);
            class111.method849(true, (byte) 126);
            if (class281.field4827) {
                int var21 = class276.field4742.field5125[0] >> 3;
                int var22 = class276.field4742.field5154[0] >> 3;
                class133.method997(var22, (byte) -85, var21);
            }
            class241.method1660(29, false);
        }
        class196.method1402(695633762);
        class111.method849(true, (byte) 102);
        class43.method265(class310.field5292, 98, false);
        if (class281.field4827) {
            class164.method1197();
        }
        class111.method849(true, (byte) 101);
        int var23 = class265.field4484;
        if (client.field4039 < var23) {
            var23 = client.field4039;
        }
        if (var23 < (client.field4039 - 1)) {
            int var24 = client.field4039 - 1;
        }
        if (class96.method761(true)) {
            client.method1672(0);
        } else {
            client.method1672(class265.field4484);
        }
        class231.method1605(false);
        if (class281.field4827 && var11) {
            class197.method1415(true);
            class47.method285(true, 21883);
            if (!class250.field4221) {
                class92.method688(true, arg0 ^ 0x5668);
                class111.method849(true, (byte) 113);
                class296.method2084((byte) 87, true);
            }
            if (class250.field4221) {
                class215.method1531(true, -1);
                class111.method849(true, (byte) 89);
                class241.method1660(arg0 ^ 0x5650, true);
            }
            class196.method1402(695633762);
            class111.method849(true, (byte) 65);
            class43.method265(class310.field5292, 82, true);
            class111.method849(true, (byte) 109);
            class231.method1605(false);
            class197.method1415(false);
        }
        if (class281.field4827) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    class35.field558[var25][var26].method1879(class106.field1783[0], var25 * 8, var26 * 8);
                }
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class298.method2094((byte) -121, var28, var27);
            }
        }
        class3.method18(-981);
        class118.method885(true);
        class72.method520(64);
        class196.method1402(arg0 ^ 0x2976D10B);
        if (class37.field561 != null && client.field4041 != null && class18.field281 == 25) {
            class162.field2724++;
            class255.field4318.method1523(22260, 245);
            class255.field4318.method436(1057001181, -18820);
        }
        if (!class250.field4221) {
            int var29 = (class20.field332 - 6) / 8;
            int var30 = (class20.field332 + 6) / 8;
            int var31 = (class72.field1201 - 6) / 8;
            int var32 = (class72.field1201 + 6) / 8;
            for (int var33 = var29 - 1; var33 <= var30 + 1; var33++) {
                for (int var34 = var31 - 1; var34 <= var32 + 1; var34++) {
                    if (var29 > var33 || var33 > var30 || var34 < var31 || var32 < var34) {
                        class174.field2883.method622((byte) 88, class3.method14(new class255[] { class76.field1250, class215.method1532(var33, true), class255.field4360, class215.method1532(var34, true) }, (byte) -124));
                        class174.field2883.method622((byte) 89, class3.method14(new class255[] { class95.field1636, class215.method1532(var33, true), class255.field4360, class215.method1532(var34, true) }, (byte) -94));
                    }
                }
            }
        }
        if (class18.field281 == 28) {
            class256.method1798(-111, 10);
        } else {
            class256.method1798(arg0 ^ 0xFFFFA9E6, 30);
            if (client.field4041 != null) {
                class255.field4318.method1523(arg0 + 139, 27);
            }
        }
        class118.method885(true);
        class68.method414((byte) -119);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)I", line = 731)
    public final int method1655(int arg0) throws IOException {
        if (arg0 != 28982) {
            this.field3980 = -20;
        }
        field3985++;
        return this.field3978 ? 0 : this.field3982.read();
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V", line = 756)
    public static void method1656(int arg0) {
        field3997 = null;
        field3983 = (int[][]) null;
        field3987 = null;
        if (arg0 != -3917) {
            field3995 = 112;
        }
    }
}
