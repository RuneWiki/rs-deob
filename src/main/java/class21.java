import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class21 extends class274 {

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field377;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "Luj;")
    public static class132 field381 = new class132(32);

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Ljava/lang/String;")
    public static String field382 = "scroll:";

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field383 = -1;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Lbb;")
    public static class49 field387 = new class49();

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
    public final boolean method136(byte arg0) {
        if (arg0 <= 83) {
            return false;
        } else {
            field378++;
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
    public static final void method137(int arg0, int arg1) {
        field385++;
        if (arg0 == 4) {
            class36 var2 = class136.method1013(12, arg1, (byte) -90);
            var2.method221(arg0 ^ 0x5);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method138(byte arg0) {
        if (arg0 > -29) {
            this.field377 = null;
        }
        field386++;
        return this.field377;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
    public static void method139(byte arg0) {
        field381 = null;
        field387 = null;
        field382 = null;
        if (arg0 >= -103) {
            method140(113, 17, 30, 119, -98, -83, 13, -31);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0 && arg1 >= 0 && arg6 < 103 && arg1 < 103) {
            if (arg2 == 0) {
                class184 var8 = class108.method812(arg4, arg6, arg1);
                if (var8 != null) {
                    int var9 = (int) (var8.field2945 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 2) {
                        var8.field2935 = new class271(var9, 2, arg0 + 4, arg4, arg6, arg1, arg3, false, var8.field2935);
                        var8.field2937 = new class271(var9, 2, arg0 + 1 & 0x3, arg4, arg6, arg1, arg3, false, var8.field2937);
                    } else {
                        var8.field2935 = new class271(var9, arg5, arg0, arg4, arg6, arg1, arg3, false, var8.field2935);
                    }
                }
            }
            if (arg2 == 1) {
                class251 var10 = class274.method1929(arg4, arg6, arg1);
                if (var10 != null) {
                    int var11 = (int) (var10.field4256 >>> 32) & Integer.MAX_VALUE;
                    if (arg5 == 4 || arg5 == 5) {
                        var10.field4255 = new class271(var11, 4, arg0, arg4, arg6, arg1, arg3, false, var10.field4255);
                    } else if (arg5 == 6) {
                        var10.field4255 = new class271(var11, 4, arg0 + 4, arg4, arg6, arg1, arg3, false, var10.field4255);
                    } else if (arg5 == 7) {
                        var10.field4255 = new class271(var11, 4, (arg0 + 2 & 0x3) + 4, arg4, arg6, arg1, arg3, false, var10.field4255);
                    } else if (arg5 == 8) {
                        var10.field4255 = new class271(var11, 4, arg0 + 4, arg4, arg6, arg1, arg3, false, var10.field4255);
                        var10.field4244 = new class271(var11, 4, (arg0 + 2 & 0x3) + 4, arg4, arg6, arg1, arg3, false, var10.field4244);
                    }
                }
            }
            if (arg2 == 2) {
                if (arg5 == 11) {
                    arg5 = 10;
                }
                class73 var12 = class162.method1197(arg4, arg6, arg1);
                if (var12 != null) {
                    var12.field1262 = new class271((int) (var12.field1278 >>> 32) & Integer.MAX_VALUE, arg5, arg0, arg4, arg6, arg1, arg3, false, var12.field1262);
                }
            }
            if (arg2 == 3) {
                class23 var13 = class119.method898(arg4, arg6, arg1);
                if (var13 != null) {
                    var13.field425 = new class271((int) (var13.field428 >>> 32) & Integer.MAX_VALUE, 22, arg0, arg4, arg6, arg1, arg3, false, var13.field425);
                }
            }
        }
        field384++;
        if (arg7 != 5) {
            method139((byte) -21);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class21(Object arg0) {
        this.field377 = arg0;
    }
}
