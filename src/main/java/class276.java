import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class276 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "B")
    private byte field4726;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public int field4731;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field4727;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public int field4734;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field4724;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lwm;")
    public static class152 field4732 = class157.method1048("Interfaces charg-Bes", 93);

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lwm;")
    public static class152 field4722 = class157.method1048("Connect-B au serveur de mise -9 jour", 105);

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 38)
    public static void method1888(boolean arg0) {
        if (arg0) {
            field4730 = 1;
        }
        field4732 = null;
        field4722 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)I", line = 70)
    public final int method1889(int arg0) {
        if (arg0 != -29120) {
            this.field4724 = 26;
        }
        field4733++;
        return (this.field4726 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 82)
    public static final void method1890(int arg0) {
        field4723++;
        int var1 = class148.field2274.length;
        if (arg0 != -1788692122) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class148.field2274[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class107.field1532; var4++) {
                    if (class284.field4835[var2] == class226.field3677[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class226.field3677[class107.field1532] = class284.field4835[var2];
                    var3 = class107.field1532++;
                }
                class291 var5 = new class291(class148.field2274[var2]);
                int var6 = 0;
                while (var5.field4946 < class148.field2274[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2021((byte) 74);
                    int var9 = var8 & 0x3F;
                    int var10 = (class284.field4835[var2] & 0xFF) * 64 + (var9 - class199.field3226);
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = var8 >> 14;
                    int var13 = (class284.field4835[var2] >> 8) * 64 + var11 - class272.field4670;
                    class242 var14 = class98.method659(arg0 + 1788692377, var5.method2021((byte) 74));
                    if (class40.field649[var7] == null && (var14.field3969 & 0x1) > 0 && class267.field4501 == var12 && var13 >= 0 && var13 + var14.field3984 < 104 && var10 >= 0 && (var14.field3984 + var10) < 104) {
                        class40.field649[var7] = new class4();
                        class4 var15 = class40.field649[var7];
                        class97.field1403[class233.field3826++] = var7;
                        var15.field4251 = class142.field2187;
                        var15.method15(var14, 0);
                        var15.method1703(var15.field72.field3984, 1159);
                        var15.field4209 = var15.field4161 = class183.field2912[var15.field72.field3957];
                        var15.field4190 = var15.field72.field3968;
                        var15.field4171 = var15.field72.field3982;
                        if (var15.field4190 == 0) {
                            var15.field4161 = 0;
                        }
                        var15.method1711(var15.method67(-4391), true, var10, (byte) -81, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 172)
    public class276() {
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)I", line = 176)
    public final int method1891(int arg0) {
        if (arg0 != -2) {
            method1890(-69);
        }
        field4728++;
        return this.field4726 & 0x7;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lhi;)V", line = 185)
    public class276(class291 arg0) {
        this.field4726 = arg0.method1962(false);
        this.field4731 = arg0.method2021((byte) 74);
        this.field4727 = arg0.method1969((byte) -16);
        this.field4734 = arg0.method1969((byte) -16);
        this.field4725 = arg0.method1969((byte) -16);
        this.field4724 = arg0.method1969((byte) -16);
    }
}
