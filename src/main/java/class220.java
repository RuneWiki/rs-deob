import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class220 extends class30 {

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lia;")
    private static class257 field3723 = class28.method234(-7, "Loaded sprites");

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lia;")
    public static class257 field3725 = class28.method234(-124, "huffman");

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "Lia;")
    public static class257 field3732 = field3723;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field3728;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public static final void method1450(boolean arg0, int arg1) {
        field3727++;
        if (class17.field380 == null) {
            return;
        }
        try {
            class152 var2 = new class152(4);
            var2.method1023(arg1 ^ 0x338F, arg0 ? 2 : 3);
            var2.method1019((byte) 80, 0);
            class17.field380.method1419(arg1, 0, var2.field2638, 124);
        } catch (IOException var4) {
            try {
                class17.field380.method1421((byte) 90);
            } catch (Exception var3) {
            }
            class94.field1778++;
            class17.field380 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
    public static void method1451(boolean arg0) {
        field3728 = null;
        field3725 = null;
        if (!arg0) {
            method1452(-27, 74);
        }
        field3732 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)I")
    public static final int method1452(int arg0, int arg1) {
        if (arg0 > -34) {
            method1450(false, 106);
        }
        field3731++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class220() {
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
    public class220(int arg0) {
        this.field3726 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
    public static final void method1453(boolean arg0) {
        field3729++;
        if (arg0) {
            return;
        }
        int var1 = class40.field827.method909(8, (byte) -110);
        if (class231.field3880 > var1) {
            for (int var2 = var1; var2 < class231.field3880; var2++) {
                class125.field2241[class183.field3192++] = class132.field2362[var2];
            }
        }
        if (class231.field3880 < var1) {
            throw new RuntimeException("gppov1");
        }
        class231.field3880 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class132.field2362[var3];
            class180 var5 = class55.field1180[var4];
            int var6 = class40.field827.method909(1, (byte) -110);
            if (var6 == 0) {
                class132.field2362[class231.field3880++] = var4;
                var5.field4180 = class7.field153;
            } else {
                int var7 = class40.field827.method909(2, (byte) -120);
                if (var7 == 0) {
                    class132.field2362[class231.field3880++] = var4;
                    var5.field4180 = class7.field153;
                    class210.field3591[class212.field3628++] = var4;
                } else if (var7 == 1) {
                    class132.field2362[class231.field3880++] = var4;
                    var5.field4180 = class7.field153;
                    int var8 = class40.field827.method909(3, (byte) -119);
                    var5.method1584(var8, false, (byte) 4);
                    int var9 = class40.field827.method909(1, (byte) -127);
                    if (var9 == 1) {
                        class210.field3591[class212.field3628++] = var4;
                    }
                } else if (var7 == 2) {
                    class132.field2362[class231.field3880++] = var4;
                    var5.field4180 = class7.field153;
                    int var10 = class40.field827.method909(3, (byte) -111);
                    var5.method1584(var10, true, (byte) 4);
                    int var11 = class40.field827.method909(3, (byte) -124);
                    var5.method1584(var11, true, (byte) 4);
                    int var12 = class40.field827.method909(1, (byte) -118);
                    if (var12 == 1) {
                        class210.field3591[class212.field3628++] = var4;
                    }
                } else if (var7 == 3) {
                    class125.field2241[class183.field3192++] = var4;
                }
            }
        }
    }
}
