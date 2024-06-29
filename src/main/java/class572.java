import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class572 implements class307 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field8265;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field8266 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!fj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8269++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lvt;I)I")
    public static final int method3326(class256 arg0, int arg1) {
        field8267++;
        if (arg1 != 5122) {
            field8266 = 40;
        }
        if (class256.field3646 == arg0) {
            return 5120;
        } else if (class256.field3649 == arg0) {
            return 5122;
        } else if (class256.field3651 == arg0) {
            return 5124;
        } else if (class256.field3653 == arg0) {
            return 5121;
        } else if (class256.field3654 == arg0) {
            return 5123;
        } else if (class256.field3655 == arg0) {
            return 5125;
        } else if (class256.field3656 == arg0) {
            return 5131;
        } else if (class256.field3657 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)[Lraa;")
    public static final class528[] method3327(boolean arg0) {
        field8263++;
        if (!arg0) {
            field8266 = -22;
        }
        return new class528[] { class646.field9321, class224.field3156, class605.field8857, class3.field16, class40.field440, class67.field738 };
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILjava/awt/Canvas;Le;)Loa;")
    public static final class605 method3328(int arg0, int arg1, Canvas arg2, class462 arg3) {
        int var4 = -45 % ((arg0 - 81) / 40);
        field8264++;
        return new class362(arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public static final void method3329(int arg0) {
        class90.field1037.method718(-123);
        field8262++;
        class293.field4065.method718(-122);
        if (arg0 < 103) {
            field8266 = -93;
        }
        for (class631 var1 = (class631) class436.field6487.method719(false); var1 != null; var1 = (class631) class436.field6487.method716(14)) {
            int var18 = var1.field9100;
            if (var18 < 1000) {
                var1.method2108(true);
                if (var18 == 44 || var18 == 9 || var18 == 2 || var18 == 15 || var18 == 46 || var18 == 45 || var18 == 13) {
                    class293.field4065.method706(var1, true);
                } else {
                    class90.field1037.method706(var1, true);
                }
            }
        }
        class90.field1037.method713(class436.field6487, (byte) 123);
        class293.field4065.method713(class436.field6487, (byte) 123);
        if (class111.field1359 <= 1) {
            class454.field6790 = null;
        } else if (class565.field8057 && class280.field3915.method284(-82, 81) && class111.field1359 > 2) {
            class454.field6790 = (class631) class436.field6487.field1413.field4677.field4677;
        } else {
            class454.field6790 = (class631) class436.field6487.field1413.field4677;
        }
        int var2 = -1;
        class458 var3 = (class458) class187.field2310.method719(false);
        if (var3 != null) {
            var2 = var3.method228(-12152);
        }
        if (!class600.field8764) {
            if (var2 == 0 && (class319.field4622 == 1 && class111.field1359 > 2 || class264.method1746((byte) 47))) {
                var2 = 2;
            }
            if (var2 == 2 && class111.field1359 > 0 && var3 != null) {
                if (class39.field425 == null && class514.field7505 == 0) {
                    class311.method2060(100, var3.method227(-4915), var3.method230((byte) 54));
                } else {
                    class313.field4572 = 2;
                }
            }
            if (var2 == 0 && class111.field1359 > 0) {
                class646.method3684(-22986);
            }
            if (class39.field425 == null && class514.field7505 == 0) {
                class637.field9160 = null;
                class313.field4572 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class32.field369.method778(6);
            int var5 = class32.field369.method777((byte) 127);
            if (var4 < class291.field4026 - 10 || (class291.field4026 + class421.field6308 + 10) < var4 || class614.field8924 - 10 > var5 || class614.field8924 + class508.field7392 + 10 < var5) {
                class427.method2671(18);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class291.field4026;
        int var7 = class614.field8924;
        int var8 = class421.field6308;
        int var9 = var3.method227(-4915);
        int var10 = var3.method230((byte) 54);
        int var11 = -1;
        for (int var12 = 0; var12 < class111.field1359; var12++) {
            if (class438.field6510) {
                int var17 = (class111.field1359 - var12 - 1) * 16 + var7 + 33;
                if (var6 < var9 && var9 < var6 + var8 && var17 - 13 < var10 && (var17 + 4) > var10) {
                    var11 = var12;
                }
            } else {
                int var16 = (class111.field1359 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && var9 < var6 + var8 && var10 > (var16 - 13) && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class89 var14 = new class89(class436.field6487);
            for (class631 var15 = (class631) var14.method572(12491); var15 != null; var15 = (class631) var14.method575(18032)) {
                if (var11 == var13) {
                    class440.method2742(var9, var10, (byte) 110, var15);
                }
                var13++;
            }
        }
        class427.method2671(18);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class572(String arg0, int arg1) {
        this.field8265 = arg1;
    }

    static {
        new class474(null, "Dieses System darf nicht missbraucht werden!", null, null);
    }
}
