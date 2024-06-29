import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class239 extends class192 {

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "Loh;")
    public static class258 field4168 = class153.method1046("Fertigkeit: ", 115);

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "Loh;")
    public static class258 field4167 = class153.method1046(" zuerst von Ihrer Freunde)2Liste(Q", 98);

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field4169 = 0;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "Lfk;")
    private class144 field4172;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "[Lkl;")
    public static class65[] field4170;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lva;BI)V", line = 7)
    private final void method1638(class235 arg0, byte arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method1589(109);
            if (this.field4172 == null) {
                int var5 = class286.method2014(var4, arg1 ^ 0xD1524C0F);
                this.field4172 = new class144(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1589(arg1 + 99) == 1;
                int var8 = arg0.method1602(18160);
                class154 var9;
                if (var7) {
                    var9 = new class48(arg0.method1620(125));
                } else {
                    var9 = new class119(arg0.method1611(-110));
                }
                this.field4172.method984((byte) -119, var9, (long) var8);
            }
        }
        field4164++;
        if (arg1 != -33) {
            field4167 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)I", line = 54)
    public final int method1639(byte arg0, int arg1, int arg2) {
        field4165++;
        if (arg0 != -37) {
            field4168 = (class258) null;
        }
        if (this.field4172 == null) {
            return arg1;
        } else {
            class119 var4 = (class119) this.field4172.method986((long) arg2, 0);
            return var4 == null ? arg1 : var4.field2107;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BILnd;)V", line = 81)
    public static final void method1640(byte arg0, int arg1, class58 arg2) {
        if (arg2.field943 > class202.field3498) {
            class73.method543(arg2, -114);
        } else if (class202.field3498 <= arg2.field978) {
            class70.method528((byte) -113, arg2);
        } else {
            class279.method1966(arg2, -19119);
        }
        field4163++;
        if (arg2.field912 < 128 || arg2.field934 < 128 || arg2.field912 >= 13184 || arg2.field934 >= 13184) {
            arg2.field978 = 0;
            arg2.field922 = -1;
            arg2.field965 = -1;
            arg2.field943 = 0;
            arg2.field912 = arg2.field975[0] * 128 + (arg2.method447(18123) * 64);
            arg2.field934 = arg2.field959[0] * 128 + (arg2.method447(18123) * 64);
            arg2.method451((byte) 100);
        }
        if (class152.field2606 == arg2 && (arg2.field912 < 1536 || arg2.field934 < 1536 || arg2.field912 >= 11776 || arg2.field934 >= 11776)) {
            arg2.field965 = -1;
            arg2.field922 = -1;
            arg2.field978 = 0;
            arg2.field943 = 0;
            arg2.field912 = arg2.field975[0] * 128 + (arg2.method447(18123) * 64);
            arg2.field934 = arg2.field959[0] * 128 + arg2.method447(18123) * 64;
            arg2.method451((byte) 102);
        }
        class1.method4(arg2, (byte) -76);
        class130.method938(arg2, (byte) 127);
        if (arg0 > -11) {
            method1640((byte) 3, 25, (class58) null);
        }
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)V", line = 140)
    public static void method1641(byte arg0) {
        field4168 = null;
        field4170 = null;
        if (arg0 != -17) {
            method1640((byte) 58, -84, (class58) null);
        }
        field4167 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lva;Z)V", line = 156)
    public final void method1642(class235 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1589(125);
            if (var3 == 0) {
                field4173++;
                if (!arg1) {
                    this.field4172 = (class144) null;
                }
                return;
            }
            this.method1638(arg0, (byte) -33, var3);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IILoh;)Loh;", line = 183)
    public final class258 method1643(int arg0, int arg1, class258 arg2) {
        field4166++;
        if (this.field4172 == null) {
            return arg2;
        }
        class48 var4 = (class48) this.field4172.method986((long) arg1, 0);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 <= 121) {
                field4169 = -30;
            }
            return var4.field717;
        }
    }
}
