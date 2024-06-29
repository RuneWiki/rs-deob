import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class559 extends class627 {

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "J")
    private long field8138 = -1L;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "Ljava/lang/String;")
    private String field8135 = null;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8142 = new String[] { method4186(method4185("gP%X|-")), method4186(method4185("gP%X\u007f-")), method4186(method4185("gP%Xy-")), method4186(method4185("k@(\u001a")), method4186(method4185("~\u001bjXG")), method4186(method4185("gP%X{-")), method4186(method4185("hP)\u0014_w]%\u0005R?")), method4186(method4185("%X!\u001bX`G*\u0017W`\u000f")), method4186(method4185("gP%X~-")) };

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "[I")
    public static int[] field8130 = new int[1];

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    public static int field8139 = 0;

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "B")
    private byte field8133;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    private int field8134;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "[I")
    public static int[] field8140;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lkj;I)V")
    public final void method96(class26 arg0, int arg1) {
        try {
            field8136++;
            class756 var3 = new class756();
            var3.field10814 = this.field8133;
            int var4 = -50 % ((arg1 - 44) / 34);
            var3.field10815 = this.field8134;
            var3.field10808 = this.field8135;
            arg0.method298(var3, (byte) 70);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8142[2] + (arg0 == null ? field8142[3] : field8142[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "()V")
    public static final void method4181() {
        for (int var0 = class210.field3055; var0 < class293.field4121; var0++) {
            for (int var1 = 0; var1 < class508.field7455; var1++) {
                for (int var2 = 0; var2 < class700.field9795; var2++) {
                    class621 var3 = class608.field8715[var0][var1][var2];
                    if (var3 != null) {
                        class571 var4 = var3.field8842;
                        class571 var5 = var3.field8845;
                        if (var4 != null && var4.method46(-107)) {
                            class451.method3496(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method46(-114)) {
                                class451.method3496(var5, var0, var1, var2, 1, 1);
                                var5.method40(0, (byte) -96, 0, var4, false, 0, class531.field7699);
                                var5.method44((byte) 122);
                            }
                            var4.method44((byte) 121);
                        }
                        for (class219 var6 = var3.field8841; var6 != null; var6 = var6.field3190) {
                            class604 var8 = var6.field3188;
                            if (var8 != null && var8.method46(-109)) {
                                class451.method3496(var8, var0, var1, var2, var8.field8666 + 1 - var8.field8663, var8.field8661 - var8.field8669 + 1);
                                var8.method44((byte) 124);
                            }
                        }
                        class122 var7 = var3.field8850;
                        if (var7 != null && var7.method46(-102)) {
                            class744.method5390(var7, var0, var1, var2);
                            var7.method44((byte) 117);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
    public static final boolean method4182(int arg0, int arg1) {
        try {
            field8132++;
            int var2 = -118 / ((arg0 + 67) / 56);
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8142[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljc;I)V")
    public final void method97(class711 arg0, int arg1) {
        try {
            field8141++;
            if (arg0.method5128(0) != 255) {
                arg0.field9945--;
                this.field8138 = arg0.method5147((byte) 74);
            }
            this.field8135 = arg0.method5084(84);
            this.field8134 = arg0.method5116((byte) -121);
            this.field8133 = arg0.method5125((byte) 105);
            arg0.method5147((byte) 81);
            if (arg1 > -97) {
                method4184(true);
            }
            if (class440.field6489) {
                System.out.println(field8142[6] + this.field8138 + field8142[7] + this.field8135);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8142[8] + (arg0 == null ? field8142[3] : field8142[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V")
    public static void method4183(byte arg0) {
        try {
            field8140 = null;
            field8130 = null;
            int var1 = -54 / ((-arg0 - 16) / 60);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8142[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(Z)Z")
    public static final boolean method4184(boolean arg0) {
        try {
            if (arg0) {
                method4181();
            }
            field8131++;
            return class72.field1049 > 0;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8142[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4185(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4186(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 68;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
