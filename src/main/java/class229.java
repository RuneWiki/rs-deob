import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class229 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Ljp;")
    public static class55 field3458 = new class55(106, -2);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lpu;")
    public static class179 field3459 = new class179(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3461 = null;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[[[B")
    public static byte[][][] field3460;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1555(int arg0, int arg1, byte arg2) {
        field3457++;
        if (arg2 < 94) {
            return false;
        } else if (class57.method371(arg0, arg1, -79)) {
            return class269.method1862(-24050, arg1, arg0) | (arg0 & 0xB000) != 0 | class463.method2836(arg0, arg1, 119) ? true : (arg1 & 0x37) == 0 & (class181.method1269(false, arg1, arg0) | class103.method829(arg1, 65536, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method1556(int arg0) {
        field3460 = null;
        field3458 = null;
        field3459 = null;
        field3461 = null;
        if (arg0 >= -74) {
            method1557(85);
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static final void method1557(int arg0) {
        field3456++;
        class5.method27(class374.field5527, arg0 ^ 0xF3963E24);
        class499.field7263++;
        if (class218.field3288 && class178.field2725) {
            int var1 = class377.field5570.method1475((byte) 108);
            int var2 = class377.field5570.method1484(-22647);
            int var3 = var2 - class515.field7500;
            int var4 = var1 - class299.field4606;
            if (var4 < class483.field7078) {
                var4 = class483.field7078;
            }
            if (var3 < class380.field5598) {
                var3 = class380.field5598;
            }
            if ((class483.field7078 + class530.field7741.field629) < (class374.field5527.field629 + var4)) {
                var4 = class483.field7078 + class530.field7741.field629 - class374.field5527.field629;
            }
            if ((class380.field5598 + class530.field7741.field591) < (class374.field5527.field591 + var3)) {
                var3 = class380.field5598 + class530.field7741.field591 - class374.field5527.field591;
            }
            int var5 = class530.field7741.field488 + var4 - class483.field7078;
            int var6 = var3 + class530.field7741.field504 - class380.field5598;
            if (class377.field5570.method1474(arg0 - 37644)) {
                if (class499.field7263 > class374.field5527.field528) {
                    int var7 = var4 - class104.field1605;
                    int var8 = var3 - class108.field1637;
                    if (class374.field5527.field502 < var7 || -class374.field5527.field502 > var7 || class374.field5527.field502 < var8 || (-class374.field5527.field502) > var8) {
                        class155.field2384 = true;
                    }
                }
                if (class374.field5527.field501 != null && class155.field2384) {
                    class510 var9 = new class510();
                    var9.field7423 = class374.field5527;
                    var9.field7425 = var6;
                    var9.field7413 = class374.field5527.field501;
                    var9.field7416 = var5;
                    class152.method1090(var9);
                }
            } else {
                if (class155.field2384) {
                    class62.method415(false);
                    if (class374.field5527.field559 != null) {
                        class510 var10 = new class510();
                        var10.field7417 = class293.field4529;
                        var10.field7416 = var5;
                        var10.field7423 = class374.field5527;
                        var10.field7413 = class374.field5527.field559;
                        var10.field7425 = var6;
                        class152.method1090(var10);
                    }
                    if (class293.field4529 != null && client.method3084(class374.field5527) != null) {
                        class364.method2326(class374.field5527, class293.field4529, arg0 ^ 0xFFFFAB66);
                    }
                } else if ((class336.field5064 == 1 || class18.method116(-28633)) && class540.field7909 > 2) {
                    class49.method328(1, class299.field4606 + class104.field1605, class515.field7500 - -class108.field1637);
                } else if (class421.method2626((byte) -121)) {
                    class49.method328(1, class299.field4606 + class104.field1605, class515.field7500 - -class108.field1637);
                }
                class374.field5527 = null;
            }
            if (arg0 != 21731) {
                method1557(72);
            }
        } else if (class499.field7263 > 1) {
            class374.field5527 = null;
        }
    }
}
