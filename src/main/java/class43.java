import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class43 extends class443 {

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "[I")
    public static int[] field634 = new int[100];

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "[Lkq;")
    public static class69[] field637;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 10)
    public static final String method304(byte arg0, String arg1) {
        field636++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != 23) {
            method306((class325) null, 109);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILlq;Llq;)V", line = 59)
    public static final void method305(int arg0, int arg1, int arg2, class236 arg3, class236 arg4) {
        if (class106.field1405[arg0][arg1][arg2] == null) {
            class267.method1787(arg0, arg1, arg2);
        }
        class106.field1405[arg0][arg1][arg2].field1063 = arg3;
        class106.field1405[arg0][arg1][arg2].field1076 = arg4;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lmk;I)V", line = 70)
    public static final void method306(class325 arg0, int arg1) {
        field638++;
        if (arg1 == -1) {
            class322.field4801 = arg0;
        }
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V", line = 88)
    public static void method308(int arg0) {
        field637 = null;
        if (arg0 == -1) {
            field634 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)Llc;", line = 100)
    public static final class189 method309(byte arg0, int arg1) {
        field635++;
        class51 var2 = class219.field3053;
        class189 var3;
        synchronized (class219.field3053) {
            var3 = (class189) class219.field3053.method378((byte) 28, (long) arg1);
        }
        if (arg0 != 2) {
            field634 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class400.field5865.method1235(class145.method1002(arg1, false), false, class6.method31(arg1, (byte) -113));
        class189 var5 = new class189();
        var5.field2633 = arg1;
        if (var4 != null) {
            var5.method1256(new class341(var4), (byte) 124);
        }
        var5.method1257(false);
        class51 var6 = class219.field3053;
        synchronized (class219.field3053) {
            class219.field3053.method367((long) arg1, var5, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(JB)V", line = 129)
    public static final void method310(long arg0, byte arg1) {
        field639++;
        if (arg1 != 62) {
            method310(-7L, (byte) -57);
        }
        int var3 = class334.field4904;
        int var4 = class7.field96;
        if (class357.field5297 != var3) {
            int var5 = var3 - class357.field5297;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class357.field5297 += var6;
        }
        if (class159.field2065 != var4) {
            int var7 = var4 - class159.field2065;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class159.field2065 += var8;
        }
        if (!class331.field4880) {
            class39.field588 += (float) arg0 * class397.field5791 / 40.0F * 8.0F;
            class247.field3479 += (float) arg0 * class267.field3961 / 40.0F * 8.0F;
        }
        class356.method2342((byte) -125);
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method303(byte arg0);

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(B)Z")
    public abstract boolean method307(byte arg0);
}
