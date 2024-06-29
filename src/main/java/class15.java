import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class15 implements Runnable {

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Z")
    private boolean field175 = false;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    private int field182 = 0;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    private int field194 = 0;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field174;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Ljh;")
    private class124 field188;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Ljava/io/InputStream;")
    private InputStream field180;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field187;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field177 = 0;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field169 = 0;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "[I")
    public static int[] field193 = new int[2];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field168 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lnc;")
    private class161 field184;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lak;")
    public static class172 field171;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "[B")
    private byte[] field192;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZZII)V", line = 4)
    public static final void method84(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field189++;
        if (arg4) {
            class232.method1676();
        }
        if (class204.field3362 != null && (arg6 != 3 || class70.field994 != arg0 || class45.field634 != arg2)) {
            class271.method1927(class14.field159, class204.field3362, 4);
            class204.field3362 = null;
        }
        if (arg6 == 3 && class204.field3362 == null) {
            class204.field3362 = class208.method1507(arg0, 0, class14.field159, 70, 0, arg2);
            if (class204.field3362 != null) {
                class45.field634 = arg2;
                class70.field994 = arg0;
                class61.method412(class14.field159, arg1 - 6973);
            }
        }
        if (arg6 == 3 && class204.field3362 == null) {
            method84(-1, 6976, -1, true, true, arg5, class318.field4946);
            return;
        }
        if (arg1 != 6976) {
            field168 = 40;
        }
        Container var7;
        if (class204.field3362 != null) {
            var7 = class204.field3362;
        } else if (class278.field4482 == null) {
            var7 = class14.field159.field1951;
        } else {
            var7 = class278.field4482;
        }
        class55.field780 = var7.getSize().width;
        class88.field1221 = var7.getSize().height;
        if (class278.field4482 == var7) {
            Insets var8 = class278.field4482.getInsets();
            class88.field1221 -= var8.top + var8.bottom;
            class55.field780 -= var8.right + var8.left;
        }
        if (arg6 >= 2) {
            class36.field481 = 0;
            class133.field2095 = class55.field780;
            class46.field641 = 0;
            class20.field276 = class88.field1221;
        } else {
            class133.field2095 = 765;
            class36.field481 = (class55.field780 - 765) / 2;
            class46.field641 = 0;
            class20.field276 = 503;
        }
        if (arg3) {
            class51.method336(class94.field1290, -1);
            class79.method538(class94.field1290, (byte) -34);
            if (class158.field2614 != null) {
                class158.field2614.method1701((byte) 110, class94.field1290);
            }
            class341.field5296.method676(89);
            class50.method326(9063, class94.field1290);
            class246.method1759(class94.field1290, (byte) 113);
            if (class158.field2614 != null) {
                class158.field2614.method1703(arg1 ^ 0x18A8, class94.field1290);
            }
        } else {
            if (class232.field3690) {
                class232.method1666(class133.field2095, class20.field276);
            }
            class94.field1290.setSize(class133.field2095, class20.field276);
            if (class278.field4482 == var7) {
                Insets var9 = class278.field4482.getInsets();
                class94.field1290.setLocation(var9.left + class36.field481, class46.field641 + var9.top);
            } else {
                class94.field1290.setLocation(class36.field481, class46.field641);
            }
        }
        if (arg6 == 0 && arg5 > 0) {
            class232.method1668(class94.field1290);
        }
        if (arg4 && arg6 > 0) {
            class94.field1290.setIgnoreRepaint(true);
            if (!class174.field2880) {
                class229.method1626();
                class8.field120 = null;
                class8.field120 = class210.method1518(class94.field1290, arg1 ^ 0x1B0F, class20.field276, class133.field2095);
                class59.method399();
                if (class5.field75 == 5) {
                    class57.method366(true, (byte) 122, class282.field4538);
                } else {
                    class138.method1025(26835, false, class108.field1605);
                }
                try {
                    Graphics var10 = class94.field1290.getGraphics();
                    class8.field120.method557(0, 0, var10, arg1 ^ 0xFFFF8D21);
                } catch (Exception var14) {
                }
                class31.method174(false);
                if (arg5 == 0) {
                    class8.field120 = class210.method1518(class94.field1290, arg1 - 6945, 503, 765);
                } else {
                    class8.field120 = null;
                }
                class161 var12 = class14.field159.method908(-3, class341.field5296.getClass());
                while (var12.field2661 == 0) {
                    class121.method867((byte) 97, 100L);
                }
                if (var12.field2661 == 1) {
                    class174.field2880 = true;
                }
            }
            if (class174.field2880) {
                class232.method1643(class94.field1290, class185.field3065 * 2);
            }
        }
        if (!class232.field3690 && arg6 > 0) {
            method84(-1, 6976, -1, true, true, arg5, 0);
            return;
        }
        if (arg6 > 0 && arg5 == 0) {
            class258.field4136.setPriority(5);
            class8.field120 = null;
            class250.method1787();
            ((class130) class170.field2814).method940(arg1 ^ 0x1B43, 200);
            if (class322.field4994) {
                class170.method1243(0.7F);
            }
            if (class61.field870 == null) {
                class61.field870 = new class149[13][13];
            }
            class118.method821(4, 104, 104);
            class241.method1740(104, 104);
            class225.method1598(-109);
        } else if (arg6 == 0 && arg5 > 0) {
            class258.field4136.setPriority(1);
            class8.field120 = class210.method1518(class94.field1290, -111, 503, 765);
            class250.method1780();
            class294.method2103();
            ((class130) class170.field2814).method940(3, 20);
            if (class322.field4994) {
                if (class149.field2311 == 1) {
                    class170.method1243(0.9F);
                }
                if (class149.field2311 == 2) {
                    class170.method1243(0.8F);
                }
                if (class149.field2311 == 3) {
                    class170.method1243(0.7F);
                }
                if (class149.field2311 == 4) {
                    class170.method1243(0.6F);
                }
            }
            class206.method1495();
            class225.method1598(-87);
        }
        class287.field4601 = !class76.method518(arg1 ^ 0xFFFFAE3C);
        if (arg4) {
            class109.method751(12508);
        }
        if (arg6 < 2) {
            class322.field4990 = false;
        } else {
            class322.field4990 = true;
        }
        if (class147.field2287 != -1) {
            class150.method1092(true, -1264641594);
        }
        if (class320.field4966 != null && (class5.field75 == 30 || class5.field75 == 25)) {
            class85.method577(123);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class174.field2884[var13] = true;
        }
        class182.field3010 = true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI[BI)V", line = 246)
    public final void method85(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field179++;
        if (this.field185) {
            return;
        }
        if (this.field175) {
            this.field175 = false;
            throw new IOException();
        }
        if (this.field192 == null) {
            this.field192 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg1; var6++) {
                this.field192[this.field182] = arg2[arg3 + var6];
                this.field182 = (this.field182 + 1) % 5000;
                if ((this.field194 + 4900) % 5000 == this.field182) {
                    throw new IOException();
                }
            }
            if (this.field184 == null) {
                this.field184 = this.field188.method898(this, (byte) -122, 3);
            }
            this.notifyAll();
            if (arg0 > -95) {
                this.method91(-89);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)I", line = 297)
    public final int method86(byte arg0) throws IOException {
        field190++;
        if (this.field185) {
            return 0;
        } else if (arg0 == 118) {
            return this.field180.read();
        } else {
            return 26;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I", line = 323)
    public final int method87(int arg0) throws IOException {
        field183++;
        if (arg0 == 5000) {
            return this.field185 ? 0 : this.field180.available();
        } else {
            return -119;
        }
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 344)
    protected final void finalize() {
        field170++;
        this.method91(-33);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 352)
    public final void method88(int arg0) {
        field181++;
        if (this.field185) {
            return;
        }
        this.field180 = new class10();
        this.field187 = new class252();
        if (arg0 != 18343) {
            field177 = 117;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ[BI)V", line = 374)
    public final void method89(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field178++;
        if (this.field185) {
            return;
        }
        if (!arg1) {
            method84(-20, 117, 6, false, false, 68, 31);
        }
        while (arg0 > 0) {
            int var5 = this.field180.read(arg2, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 402)
    public final void method90(byte arg0) throws IOException {
        field176++;
        int var2 = 79 / ((arg0 + 62) / 47);
        if (!this.field185 && this.field175) {
            this.field175 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ljava/net/Socket;Ljh;)V", line = 570)
    public class15(Socket arg0, class124 arg1) throws IOException {
        this.field174 = arg0;
        this.field188 = arg1;
        this.field174.setSoTimeout(30000);
        this.field174.setTcpNoDelay(true);
        this.field180 = this.field174.getInputStream();
        this.field187 = this.field174.getOutputStream();
    }

    @OriginalMember(owner = "client!i", name = "run", descriptor = "()V", line = 445)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                label89: {
                    synchronized (this) {
                        label90: {
                            if (this.field194 == this.field182) {
                                if (this.field185) {
                                    break label90;
                                }
                                try {
                                    this.wait();
                                } catch (InterruptedException var13) {
                                }
                            }
                            var3 = this.field194;
                            if (this.field182 < this.field194) {
                                var4 = 5000 - this.field194;
                            } else {
                                var4 = this.field182 - this.field194;
                            }
                            break label89;
                        }
                    }
                    try {
                        if (this.field180 != null) {
                            this.field180.close();
                        }
                        if (this.field187 != null) {
                            this.field187.close();
                        }
                        if (this.field174 != null) {
                            this.field174.close();
                        }
                    } catch (IOException var10) {
                    }
                    this.field192 = null;
                    break;
                }
                if (var4 > 0) {
                    try {
                        this.field187.write(this.field192, var3, var4);
                    } catch (IOException var12) {
                        this.field175 = true;
                    }
                    this.field194 = (this.field194 + var4) % 5000;
                    try {
                        if (this.field194 == this.field182) {
                            this.field187.flush();
                        }
                    } catch (IOException var11) {
                        this.field175 = true;
                    }
                }
            }
        } catch (Exception var15) {
            class26.method152(var15, (String) null, -35);
        }
        field191++;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 511)
    public final void method91(int arg0) {
        field167++;
        if (this.field185) {
            return;
        }
        synchronized (this) {
            this.field185 = true;
            this.notifyAll();
            if (arg0 >= -13) {
                this.run();
            }
        }
        if (this.field184 != null) {
            while (this.field184.field2661 == 0) {
                class121.method867((byte) -115, 1L);
            }
            if (this.field184.field2661 == 1) {
                try {
                    ((Thread) this.field184.field2664).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field184 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 550)
    public static void method92(boolean arg0) {
        if (!arg0) {
            field177 = -84;
        }
        field171 = null;
        field193 = null;
    }
}
