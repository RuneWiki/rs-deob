import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class225 extends class83 {

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "B")
    public byte field3178;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "F")
    public static float field3172;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public int field3184;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Lae;")
    public class156 field3183;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lhe;")
    public static class239 field3173;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "Lhe;")
    public static class239 field3175;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Ljava/awt/Image;")
    public static Image field3181;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([[II)V")
    public static final void method1389(int[][] arg0, int arg1) {
        ++field3182;
        class41.field629 = arg0;
        if (arg1 >= -122) {
            method1389((int[][]) null, 67);
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)I")
    public final int method526(byte arg0) {
        ++field3177;
        if (arg0 != -92) {
            this.method524(66);
        }
        return this.field3183 == null ? 0 : this.field3183.field2018 * 100 / (this.field3183.field2041.length + -this.field3178);
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        field3173 = null;
        field3175 = null;
        field3181 = null;
        if (arg0 != 100) {
            method1391(-77, (class356[]) null, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[Lts;B)V")
    public static final void method1391(int arg0, class356[] arg1, byte arg2) {
        int var3 = -105 / ((arg2 - 74) / 33);
        ++field3180;
        for (int var4 = 0; ~arg1.length < ~var4; ++var4) {
            class356 var5 = arg1[var4];
            if (var5 != null && var5.field5160 == arg0 && !client.method1191(var5)) {
                if (var5.field5170 == 0) {
                    method1391(var5.field5185, arg1, (byte) -20);
                    if (var5.field5151 != null) {
                        method1391(var5.field5185, var5.field5151, (byte) 127);
                    }
                    class311 var6 = (class311) class213.field3010.method2310((byte) -70, (long) var5.field5185);
                    if (var6 != null) {
                        class502.method3026(var6.field4525, -1);
                    }
                }
                if (var5.field5170 == 6 && var5.field5212 != -1) {
                    class168 var7 = class286.field4083.method2602(-24462, var5.field5212);
                    if (var7 != null) {
                        var5.field5224 += class91.field1245;
                        while (var5.field5224 > var7.field2205[var5.field5221]) {
                            var5.field5224 -= var7.field2205[var5.field5221];
                            ++var5.field5221;
                            if (~var7.field2219.length >= ~var5.field5221) {
                                var5.field5221 -= var7.field2210;
                                if (~var5.field5221 > -1 || ~var7.field2219.length >= ~var5.field5221) {
                                    var5.field5221 = 0;
                                }
                            }
                            var5.field5217 = var5.field5221 + 1;
                            if (var7.field2219.length <= var5.field5217) {
                                var5.field5217 -= var7.field2210;
                                if (var5.field5217 < 0 || var7.field2219.length <= var5.field5217) {
                                    var5.field5217 = -1;
                                }
                            }
                            class170.method1068(-98, var5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(B)Lqp;")
    public static final class450 method1392(byte arg0) {
        ++field3174;
        if (class482.field6965 < class345.field4994.length) {
            return class345.field4994[class482.field6965++];
        } else {
            if (arg0 >= -56) {
                field3181 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)[B")
    public final byte[] method524(int arg0) {
        ++field3176;
        if (!super.field1128 && this.field3183.field2018 >= this.field3183.field2041.length + -this.field3178) {
            return arg0 != -6554 ? null : this.field3183.field2041;
        } else {
            throw new RuntimeException();
        }
    }

    static {
        new class194("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
