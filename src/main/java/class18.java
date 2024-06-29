import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class18 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field209 = 2048;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public int field214 = 0;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public int field212 = 0;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public int field221 = 2048;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field208;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILlf;)V", line = 4)
    public final void method131(byte arg0, int arg1, class143 arg2) {
        field220++;
        while (true) {
            int var4 = arg2.method1043(true);
            if (var4 == 0) {
                if (arg0 != 124) {
                    this.field221 = 121;
                }
                return;
            }
            this.method132(var4, arg0 ^ 0xFFFFFFFA, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILlf;I)V", line = 25)
    private final void method132(int arg0, int arg1, class143 arg2, int arg3) {
        if (arg0 == 1) {
            this.field214 = arg2.method1043(true);
        } else if (arg0 == 2) {
            this.field209 = arg2.method1051(1);
        } else if (arg0 == 3) {
            this.field221 = arg2.method1051(1);
        } else if (arg0 == 4) {
            this.field212 = arg2.method1021(-1);
        }
        field213++;
        if (arg1 > -121) {
            method134(-44, -12);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 55)
    public static final void method133(int arg0) {
        if (arg0 == -12301) {
            class208.field3144.method383((byte) -48);
            field211++;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 67)
    public static final void method134(int arg0, int arg1) {
        if (arg0 != 13235) {
            return;
        }
        field216++;
        class64 var2 = (class64) class6.field67.method770((long) arg1, -53);
        if (var2 != null) {
            var2.method1290(-73);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 93)
    public static final void method135(String arg0, byte arg1) {
        field219++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg1 <= 13) {
            method133(-61);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z", line = 105)
    public static final boolean method136(byte arg0) {
        field210++;
        if (arg0 <= 78) {
            field208 = (Image) null;
        }
        try {
            return class170.method1199(false);
        } catch (IOException var5) {
            class194.method1350((byte) 106);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class246.field3866 + "," + class296.field4668 + "," + class4.field42 + " - " + class191.field2869 + "," + (class11.field113.field3747[0] + class322.field4999) + "," + (class11.field113.field3786[0] + class16.field160) + " - ";
            for (int var4 = 0; class191.field2869 > var4 && var4 < 50; var4++) {
                var3 = var3 + class282.field4499.field2260[var4] + ",";
            }
            class27.method198(var6, (byte) 62, var3);
            class68.method425(false);
            return true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;IILrj;)Ltj;", line = 140)
    public static final class201 method137(int arg0, Component arg1, int arg2, int arg3, class22 arg4) {
        field215++;
        if (class361.field5710 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class201 var5 = (class201) Class.forName("wj").getDeclaredConstructor().newInstance();
                var5.field3048 = new int[(class349.field5573 ? 2 : 1) * 256];
                var5.field3067 = arg0;
                var5.method1400(arg1);
                var5.field3073 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field3073 > 16384) {
                    var5.field3073 = 16384;
                }
                var5.method1411(var5.field3073);
                if (class146.field2318 > 0 && class303.field4729 == null) {
                    class303.field4729 = new class258();
                    class303.field4729.field4078 = arg4;
                    arg4.method155(class146.field2318, class303.field4729, -3);
                }
                if (class303.field4729 != null) {
                    if (class303.field4729.field4082[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class303.field4729.field4082[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class297 var7 = new class297(arg4, arg2);
                    var7.field3067 = arg0;
                    var7.field3048 = new int[(class349.field5573 ? 2 : 1) * 256];
                    var7.method1400(arg1);
                    var7.field3073 = 16384;
                    var7.method1411(var7.field3073);
                    if (class146.field2318 > 0 && class303.field4729 == null) {
                        class303.field4729 = new class258();
                        class303.field4729.field4078 = arg4;
                        arg4.method155(class146.field2318, class303.field4729, -3);
                    }
                    if (class303.field4729 != null) {
                        if (class303.field4729.field4082[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class303.field4729.field4082[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return arg3 == 1 ? new class201() : (class201) null;
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V", line = 222)
    public static void method138(byte arg0) {
        int var1 = -32 / ((arg0 - 66) / 43);
        field208 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V", line = 231)
    public static final void method139(boolean arg0, int arg1) {
        field217++;
        if (!arg0) {
            method139(false, -58);
        }
        class102.field1378.method387(arg1, false);
    }
}
