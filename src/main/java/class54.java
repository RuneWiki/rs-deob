import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class54 implements Runnable {

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Z")
    private boolean field807 = false;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Z")
    private boolean field813 = false;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field822 = 0;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    private int field819 = 0;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Ljava/net/Socket;")
    private Socket field814;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lca;")
    private class83 field825;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Ljava/io/InputStream;")
    private InputStream field804;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field809;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lag;")
    public static class97 field808 = new class97();

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "[I")
    public static int[] field818 = new int[256];

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Lqd;")
    public static class37 field824 = new class37(50);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Lve;")
    public static class233 field827;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lbh;")
    private class239 field799;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "[B")
    private byte[] field821;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[Lwi;")
    public static class229[] field829;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B[BII)V")
    public final void method356(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field802++;
        if (this.field807) {
            return;
        }
        if (this.field813) {
            this.field813 = false;
            throw new IOException();
        }
        if (this.field821 == null) {
            this.field821 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field821[this.field822] = arg1[arg2 + var6];
                this.field822 = (this.field822 + 1) % 5000;
                if (((this.field819 + 4900) % 5000) == this.field822) {
                    throw new IOException();
                }
            }
            if (this.field799 == null) {
                this.field799 = this.field825.method553(this, false, 3);
            }
            this.notifyAll();
        }
        if (arg0 != 13) {
            this.method362(false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I")
    public final int method357(byte arg0) throws IOException {
        int var2 = -55 % ((arg0 + 51) / 53);
        field817++;
        return this.field807 ? 0 : this.field804.available();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
    public final int method358(int arg0) throws IOException {
        if (arg0 < 8) {
            field829 = null;
        }
        field815++;
        return this.field807 ? 0 : this.field804.read();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLkl;)V")
    public static final void method359(byte arg0, class114 arg1) {
        field806++;
        if (arg1.field1629.length - arg1.field1673 < 1) {
            return;
        }
        int var2 = arg1.method760(false);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field1629.length - arg1.field1673 < var3) {
            return;
        }
        class92.field1401 = arg1.method760(false);
        if (class92.field1401 < 1) {
            class92.field1401 = 1;
        } else if (class92.field1401 > 4) {
            class92.field1401 = 4;
        }
        class263.method1750(arg1.method760(false) == 1, 0);
        class1.field17 = arg1.method760(false) == 1;
        class48.field695 = arg1.method760(false) == 1;
        class193.field2760 = arg1.method760(false) == 1;
        if (arg0 != -53) {
            method361(false);
        }
        class242.field3626 = arg1.method760(false) == 1;
        class235.field3556 = arg1.method760(false) == 1;
        class234.field3516 = arg1.method760(false) == 1;
        class1.field11 = arg1.method760(false) == 1;
        class264.field3967 = arg1.method760(false);
        if (class264.field3967 > 2) {
            class264.field3967 = 2;
        }
        if (var2 >= 2) {
            class42.field606 = arg1.method760(false) == 1;
        } else {
            class42.field606 = arg1.method760(false) == 1;
            arg1.method760(false);
        }
        class147.field2100 = arg1.method760(false) == 1;
        class290.field4579 = arg1.method760(false) == 1;
        class148.field2112 = arg1.method760(false);
        if (class148.field2112 > 2) {
            class148.field2112 = 2;
        }
        class243.field3661 = class148.field2112;
        class195.field2797 = arg1.method760(false) == 1;
        class32.field473 = arg1.method760(false);
        if (class32.field473 > 127) {
            class32.field473 = 127;
        }
        class209.field3015 = arg1.method760(false);
        class62.field1000 = arg1.method760(false);
        if (class62.field1000 > 127) {
            class62.field1000 = 127;
        }
        if (var2 >= 1) {
            class194.field2784 = arg1.method756(arg0 - 29848);
            class13.field199 = arg1.method756(-29901);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method760(false);
        }
        if (var2 >= 4) {
            int var4 = arg1.method760(false);
            if (class154.field2251 < 96) {
                var4 = 0;
            }
            class112.method727(var4);
        }
        if (var2 >= 5) {
            class190.field2708 = arg1.method759((byte) 100);
        }
        if (var2 >= 6) {
            class161.field2333 = arg1.method760(false);
        }
        if (var2 >= 7) {
            class207.field2997 = arg1.method760(false) == 1;
        }
        if (var2 >= 8) {
            class107.field1555 = arg1.method760(false) == 1;
        }
        if (var2 >= 9) {
            class185.field2645 = arg1.method760(false);
        }
        if (var2 >= 10) {
            class66.field1030 = arg1.method760(false) != 0;
        }
        if (var2 >= 11) {
            class262.field3949 = arg1.method760(false) != 0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
    public static final int method360(int arg0) {
        if (arg0 == -1928340848) {
            field810++;
            return ((class209.field3015 == 0 ? 0 : 1) << 21) + ((class195.field2797 ? 1 : 0) << 19) + ((class42.field606 ? 1 : 0) << 13) + ((class1.field11 ? 1 : 0) << 10) + ((class234.field3516 ? 1 : 0) << 9) + ((class235.field3556 ? 1 : 0) << 8) + ((class242.field3626 ? 1 : 0) << 7) + ((class48.field695 ? 1 : 0) << 5) + (class92.field1401 & 0x7) + ((class155.field2272 ? 1 : 0) << 3) + ((class1.field17 ? 1 : 0) << 4) + (((class193.field2760 ? 1 : 0) << 6) - -((class264.field3967 & 0x3) << 11)) + ((class147.field2100 ? 1 : 0) << 15) + ((class290.field4579 ? 1 : 0) << 16) + (((class32.field473 == 0 ? 0 : 1) << 20) - -((class62.field1000 == 0 ? 0 : 1) << 22)) + (class112.method726() << 23);
        } else {
            return 92;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static final void method361(boolean arg0) {
        if (arg0) {
            return;
        }
        for (class261 var1 = (class261) class128.field1874.method1219(1); var1 != null; var1 = (class261) class128.field1874.method1223(92)) {
            int var2 = var1.field3940;
            if (class159.method1072((byte) -14, var2)) {
                boolean var3 = true;
                class267[] var4 = class19.field268[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4039;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3851;
                    class267 var7 = class282.method1897(var6, 60);
                    if (var7 != null) {
                        class217.method1396(false, var7);
                    }
                }
            }
        }
        field812++;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
    public final void method362(boolean arg0) {
        field823++;
        if (this.field807) {
            return;
        }
        synchronized (this) {
            this.field807 = true;
            this.notifyAll();
            if (arg0) {
                this.field813 = true;
            }
        }
        if (this.field799 != null) {
            while (this.field799.field3588 == 0) {
                class98.method660(1L, -75);
            }
            if (this.field799.field3588 == 1) {
                try {
                    ((Thread) this.field799.field3585).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field799 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([BIII)V")
    public final void method363(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -5942) {
            this.finalize();
        }
        field826++;
        if (this.field807) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field804.read(arg0, arg3, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (arg0 > -35) {
            method365((byte) -62);
        }
        field803++;
        if (!this.field807) {
            this.field804 = new class43();
            this.field809 = new class205();
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static void method365(byte arg0) {
        field818 = null;
        int var1 = -85 / ((arg0 + 9) / 35);
        field808 = null;
        field827 = null;
        field824 = null;
        field829 = null;
    }

    @OriginalMember(owner = "client!bk", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field822 == this.field819) {
                            if (this.field807) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field822 >= this.field819) {
                            var2 = this.field822 - this.field819;
                        } else {
                            var2 = 5000 - this.field819;
                        }
                        var3 = this.field819;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field809.write(this.field821, var3, var2);
                    } catch (IOException var9) {
                        this.field813 = true;
                    }
                    this.field819 = (this.field819 + var2) % 5000;
                    try {
                        if (this.field822 == this.field819) {
                            this.field809.flush();
                        }
                    } catch (IOException var8) {
                        this.field813 = true;
                    }
                    continue;
                }
                try {
                    if (this.field804 != null) {
                        this.field804.close();
                    }
                    if (this.field809 != null) {
                        this.field809.close();
                    }
                    if (this.field814 != null) {
                        this.field814.close();
                    }
                } catch (IOException var7) {
                }
                this.field821 = null;
                break;
            }
        } catch (Exception var12) {
            class37.method259(-16, (String) null, var12);
        }
        field816++;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method366(int arg0) throws IOException {
        field820++;
        if (this.field807) {
            return;
        }
        if (this.field813) {
            this.field813 = false;
            throw new IOException();
        } else if (arg0 != 1) {
            method359((byte) 52, (class114) null);
        }
    }

    @OriginalMember(owner = "client!bk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method362(false);
        field800++;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/net/Socket;Lca;)V")
    public class54(Socket arg0, class83 arg1) throws IOException {
        this.field814 = arg0;
        this.field825 = arg1;
        this.field814.setSoTimeout(30000);
        this.field814.setTcpNoDelay(true);
        this.field804 = this.field814.getInputStream();
        this.field809 = this.field814.getOutputStream();
    }
}
