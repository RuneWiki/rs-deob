import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class156 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lik;")
    public static class410 field2361 = new class410(4);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
    public abstract void method311();

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public abstract void method319(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(III)V")
    public abstract void method308(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1192(int arg0, char arg1, String arg2) {
        field2363++;
        int var3 = class191.method1375(arg2, arg1, 74);
        String[] var4 = new String[var3 + 1];
        int var5 = arg0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public abstract void method305(int arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III[I)V")
    public abstract void method315(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public abstract void method312(int arg0);

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public abstract void method320(int arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lmk;)V")
    public abstract void method316(class156 arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([I)V")
    public abstract void method306(int[] arg0);

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public abstract void method318(int arg0);

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V")
    public static void method1193(int arg0) {
        if (arg0 != -1) {
            method1195((class139) null, (class391) null, 107);
        }
        field2361 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIII)V")
    public abstract void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lwd;ILpe;)I")
    public static final int method1194(class36 arg0, int arg1, class391 arg2) {
        field2362++;
        int var3 = 55 / ((arg1 - 67) / 32);
        if (arg0.field564 != -1) {
            return arg0.field564;
        }
        if (arg0.field546 != -1) {
            class122 var4 = class356.field4840.method917((byte) 122, arg2.method172() ? arg0.field546 : arg0.field549);
            if (!var4.field1708) {
                return var4.field1707;
            }
        }
        return arg0.field550;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lbi;Lpe;I)V")
    public static final void method1195(class139 arg0, class391 arg1, int arg2) {
        field2359++;
        class393.method2423((byte) 112, arg1, 0, 0, arg0);
        if (arg2 != 3976) {
            field2365 = -4;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public static final void method1196(boolean arg0) {
        if (!arg0) {
            field2364 = -43;
        }
        if (class447.field6475 < 0) {
            class39.field605 = -1;
            class44.field709 = -1;
            class447.field6475 = 0;
        }
        field2360++;
        if (class99.field1434 < class447.field6475) {
            class44.field709 = -1;
            class39.field605 = -1;
            class447.field6475 = class99.field1434;
        }
        if (class172.field2519 < 0) {
            class44.field709 = -1;
            class172.field2519 = 0;
            class39.field605 = -1;
        }
        if (class172.field2519 > class99.field1435) {
            class39.field605 = -1;
            class44.field709 = -1;
            class172.field2519 = class99.field1435;
        }
    }

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
    public abstract void method313(int arg0);
}
