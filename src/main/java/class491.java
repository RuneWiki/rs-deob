import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class491 {

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public int field7177;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public int field7167;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public int field7170;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public int field7175;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "B")
    public byte field7174;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public int field7180;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field7172 = 0;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field7176 = new String[100];

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lrb;")
    public class175 field7173;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Luq;")
    public class343 field7171;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "Lvs;")
    public class360 field7168;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Ldw;")
    public class400 field7179;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)I", line = 8)
    public static final int method2915(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field7178++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else {
            if (arg1 != 14954) {
                method2917((byte) 111);
            }
            return var4 == 2 ? 7 - arg2 : arg3;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z", line = 37)
    public static final boolean method2916(boolean arg0) {
        for (int var1 = class143.field2065; var1 < class222.field3107; var1++) {
            class420[][] var2 = class380.field5802[var1];
            for (int var3 = -class75.field1021; var3 <= 0; var3++) {
                int var4 = class10.field149 + var3;
                int var5 = class10.field149 - var3;
                if (var4 >= class350.field5446 || var5 < class180.field2570) {
                    for (int var6 = -class75.field1021; var6 <= 0; var6++) {
                        int var7 = class29.field458 + var6;
                        int var8 = class29.field458 - var6;
                        if (var4 >= class350.field5446) {
                            if (var7 >= class425.field6327) {
                                class420 var9 = var2[var4][var7];
                                if (var9 != null && var9.field6270) {
                                    class123.field1754 = arg0;
                                    class307.field4503.method541(-2, var9);
                                    class307.field4503.method546(0);
                                }
                            }
                            if (var8 < class95.field1379) {
                                class420 var10 = var2[var4][var8];
                                if (var10 != null && var10.field6270) {
                                    class123.field1754 = arg0;
                                    class307.field4503.method541(-2, var10);
                                    class307.field4503.method546(0);
                                }
                            }
                        }
                        if (var5 < class180.field2570) {
                            if (var7 >= class425.field6327) {
                                class420 var11 = var2[var5][var7];
                                if (var11 != null && var11.field6270) {
                                    class123.field1754 = arg0;
                                    class307.field4503.method541(-2, var11);
                                    class307.field4503.method546(0);
                                }
                            }
                            if (var8 < class95.field1379) {
                                class420 var12 = var2[var5][var8];
                                if (var12 != null && var12.field6270) {
                                    class123.field1754 = arg0;
                                    class307.field4503.method541(-2, var12);
                                    class307.field4503.method546(0);
                                }
                            }
                        }
                        if (class66.field913 == 0) {
                            if (class17.field277) {
                                class307.field4503.method543(false, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 148)
    public static void method2917(byte arg0) {
        if (arg0 != 70) {
            method2915(48, -37, 33, 122);
        }
        field7176 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V", line = 159)
    public static final void method2918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class96.field1399.field5216 != 0 && arg3 != 0 && class240.field3386 < 50 && arg0 != -1) {
            class19.field284[class240.field3386++] = new class491((byte) 2, arg0, arg3, arg4, arg2, 0);
        }
        field7169++;
        if (arg1 <= 33) {
            method2917((byte) 112);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(BIIIII)V", line = 179)
    public class491(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7177 = arg4;
        this.field7167 = arg1;
        this.field7170 = arg2;
        this.field7175 = arg3;
        this.field7174 = arg0;
        this.field7180 = arg5;
    }
}
