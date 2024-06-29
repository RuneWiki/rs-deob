import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class27 {

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "Ljt;")
    private class106 field268 = new class106(64);

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "Lvd;")
    private class39 field269;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "Ljt;")
    public static class106 field266;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)Lsba;")
    public final class217 method137(int arg0, int arg1) {
        field267++;
        class106 var3 = this.field268;
        class217 var4;
        synchronized (this.field268) {
            var4 = (class217) this.field268.method803(112, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class39 var5 = this.field269;
        byte[] var6;
        synchronized (this.field269) {
            var6 = this.field269.method211(true, arg0, arg1);
        }
        class217 var7 = new class217();
        if (var6 != null) {
            var7.method1462((byte) 61, new class645(var6));
        }
        class106 var8 = this.field268;
        synchronized (this.field268) {
            this.field268.method801(arg0 - 4, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I")
    public static final int method138(byte arg0) {
        if (arg0 >= -77) {
            method140(-77);
        }
        field270++;
        return class22.field234 == 1 ? class589.field8349 : class164.field2604;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZII)V")
    public static final void method139(boolean arg0, int arg1, int arg2) {
        field265++;
        if ((class84.field1179 > class84.field1178)) {
            class84.field1178 = (float) ((double) class84.field1178 / 30.0D + (double) class84.field1178);
            if (class84.field1178 > class84.field1179) {
                class84.field1178 = class84.field1179;
            }
            class547.method3199(true);
            class84.field1186 = (int) class84.field1178 >> 1;
            class84.field1185 = class183.method1297((byte) 123, class84.field1186);
        } else if (class84.field1178 > class84.field1179) {
            class84.field1178 = (float) ((double) class84.field1178 - (double) class84.field1178 / 30.0D);
            if (class84.field1179 > class84.field1178) {
                class84.field1178 = class84.field1179;
            }
            class547.method3199(true);
            class84.field1186 = (int) class84.field1178 >> 1;
            class84.field1185 = class183.method1297((byte) 51, class84.field1186);
        }
        if (class270.field3860 != -1 && class190.field2880 != -1) {
            int var3 = class270.field3860 - class633.field8862;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class190.field2880 - client.field4272;
            class633.field8862 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            client.field4272 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class190.field2880 = -1;
                class270.field3860 = -1;
            }
            class547.method3199(true);
        }
        if (class712.field10051 <= 0) {
            class601.field8510 = -1;
            class627.field8776 = -1;
        } else {
            class439.field6501--;
            if (class439.field6501 == 0) {
                class439.field6501 = 100;
                class712.field10051--;
            }
        }
        if (!arg0) {
            field266 = null;
        }
        if (!class752.field10514 || class603.field8529 == null) {
            return;
        }
        for (class299 var5 = (class299) class603.field8529.method1195(0); var5 != null; var5 = (class299) class603.field8529.method1201(2)) {
            class519 var6 = class84.field1175.method864(-96, var5.field4237.field8729);
            if (var5.method1884(arg2, 11384, arg1)) {
                if (var6.field7436 != null) {
                    if (var6.field7436[4] != null) {
                        class240.method1593(var6.field7436[4], var6.field7412, (byte) 126, false, (long) var5.field4237.field8729, -1, false, -1, 1010, 0, true, (long) var5.field4237.field8729, var6.field7401);
                    }
                    if (var6.field7436[3] != null) {
                        class240.method1593(var6.field7436[3], var6.field7412, (byte) -58, false, (long) var5.field4237.field8729, -1, false, -1, 1006, 0, true, (long) var5.field4237.field8729, var6.field7401);
                    }
                    if (var6.field7436[2] != null) {
                        class240.method1593(var6.field7436[2], var6.field7412, (byte) 112, false, (long) var5.field4237.field8729, -1, false, -1, 1002, 0, true, (long) var5.field4237.field8729, var6.field7401);
                    }
                    if (var6.field7436[1] != null) {
                        class240.method1593(var6.field7436[1], var6.field7412, (byte) -103, false, (long) var5.field4237.field8729, -1, false, -1, 1007, 0, true, (long) var5.field4237.field8729, var6.field7401);
                    }
                    if (var6.field7436[0] != null) {
                        class240.method1593(var6.field7436[0], var6.field7412, (byte) -40, false, (long) var5.field4237.field8729, -1, false, -1, 1012, 0, true, (long) var5.field4237.field8729, var6.field7401);
                    }
                }
                if (!var5.field4237.field8726) {
                    var5.field4237.field8726 = true;
                    class709.method4032(class63.field915, var5.field4237.field8729, var6.field7412);
                }
                if (var5.field4237.field8726) {
                    class709.method4032(class257.field3688, var5.field4237.field8729, var6.field7412);
                }
            } else if (var5.field4237.field8726) {
                var5.field4237.field8726 = false;
                class709.method4032(class589.field8347, var5.field4237.field8729, var6.field7412);
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
    public static void method140(int arg0) {
        field266 = null;
        if (arg0 != -1) {
            field266 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class27(class464 arg0, int arg1, class39 arg2) {
        this.field269 = arg2;
        this.field269.method229(5, 0);
    }

    static {
        new class73("", 76);
        field266 = new class106(8);
    }
}
