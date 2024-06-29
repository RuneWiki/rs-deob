import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class46 extends class29 {

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "Z")
    public volatile boolean field624 = true;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Ljava/lang/String;")
    public static String field625 = "Loaded update list";

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field627 = -1;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Z")
    public boolean field622;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Z")
    public boolean field626;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "[Lug;")
    public static class321[] field629;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)V", line = 10)
    public static void method307(byte arg0) {
        if (arg0 < -100) {
            field625 = null;
            field629 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[I[ILc;[I)V", line = 33)
    public static final void method309(int arg0, int[] arg1, int[] arg2, class320 arg3, int[] arg4) {
        field630++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg3.field2012.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field2012[var9] = null;
                    } else {
                        class80 var10 = class37.method236(var6, 20254);
                        class188 var11 = arg3.field2012[var9];
                        int var12 = var10.field1207;
                        if (var11 != null) {
                            if (var11.field3058 == var6) {
                                if (var12 == 0) {
                                    var11 = arg3.field2012[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field3057 = 0;
                                    var11.field3052 = 1;
                                    var11.field3059 = 0;
                                    var11.field3048 = var8;
                                    var11.field3055 = 0;
                                    class253.method1789(19080, arg3.field1944, var10, 0, arg3.field1980, class13.field159 == arg3);
                                } else if (var12 == 2) {
                                    var11.field3057 = 0;
                                }
                            } else if (var10.field1197 >= class37.method236(var11.field3058, arg0 + 20255).field1197) {
                                var11 = arg3.field2012[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class188 var13 = arg3.field2012[var9] = new class188();
                            var13.field3052 = 1;
                            var13.field3055 = 0;
                            var13.field3048 = var8;
                            var13.field3059 = 0;
                            var13.field3058 = var6;
                            var13.field3057 = 0;
                            class253.method1789(arg0 ^ 0xFFFFB577, arg3.field1944, var10, 0, arg3.field1980, class13.field159 == arg3);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg0 != -1) {
            field629 = (class321[]) null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(B)V", line = 129)
    public static final void method310(byte arg0) {
        if (arg0 != -104) {
            method310((byte) 42);
        }
        field623++;
        if (class289.field4555 != null) {
            class84 var1 = class289.field4555;
            synchronized (class289.field4555) {
                class289.field4555 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V", line = 154)
    public static final void method312(int arg0, int arg1, int arg2, int arg3) {
        field628++;
        int var4 = class13.field164 * arg0 >> 8;
        if (arg1 != 0) {
            field625 = (String) null;
        }
        if (var4 != 0 && arg2 != -1) {
            class12.method69(class187.field3043, arg1 ^ 0x7E, 0, var4, false, arg2);
            class334.field5181 = true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)[B")
    public abstract byte[] method308(byte arg0);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
    public abstract int method311(int arg0);
}
