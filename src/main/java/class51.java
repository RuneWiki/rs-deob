import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class51 implements class407 {

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Ljava/lang/String;")
    public static String field489 = " ";

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "[J")
    public static long[] field497 = new long[100];

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public int field502;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "Z")
    public boolean field493;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)V")
    public static void method243(int arg0) {
        field497 = null;
        field489 = null;
        if (arg0 != 1) {
            field498 = 68;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lwa;B)Z")
    public final boolean method244(class407 arg0, byte arg1) {
        field495++;
        if (!(arg0 instanceof class51)) {
            return false;
        }
        class51 var3 = (class51) arg0;
        if (this.field501 != var3.field501) {
            return false;
        } else if (this.field502 == var3.field502) {
            int var4 = -48 % ((arg1 - 61) / 45);
            if (this.field490 != var3.field490) {
                return false;
            } else if (this.field491 != var3.field491) {
                return false;
            } else if (this.field494 != var3.field494) {
                return false;
            } else if (this.field499 == var3.field499) {
                return this.field493 == var3.field493;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
    public static final void method245(int arg0) {
        class27.field257 = arg0;
        for (int var1 = 0; var1 < class231.field3184; var1++) {
            for (int var2 = 0; var2 < class209.field2840; var2++) {
                if (class176.field2209[arg0][var1][var2] == null) {
                    class176.field2209[arg0][var1][var2] = new class96(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method246(int arg0, String arg1) {
        field500++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 < 97) {
            field497 = null;
        }
        for (int var2 = 0; var2 < class88.field993; var2++) {
            if (arg1.equalsIgnoreCase(class198.field2647[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class427.field6264.field2034);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
    public static final void method247(byte arg0) {
        field492++;
        class448.field6514.method297(false);
        int var1 = class448.field6514.method305(1, -7985);
        if (var1 == 0) {
            return;
        }
        int var2 = class448.field6514.method305(2, -7985);
        if (var2 == 0) {
            class192.field2423[class338.field4509++] = 2047;
        } else if (var2 == 1) {
            int var3 = class448.field6514.method305(3, -7985);
            class427.field6264.method2613(1, var3, 0);
            int var4 = class448.field6514.method305(1, -7985);
            if (var4 == 1) {
                class192.field2423[class338.field4509++] = 2047;
            }
        } else if (var2 == 2) {
            if (class448.field6514.method305(1, -7985) == 1) {
                int var6 = class448.field6514.method305(3, -7985);
                class427.field6264.method2613(2, var6, 0);
                int var7 = class448.field6514.method305(3, -7985);
                class427.field6264.method2613(2, var7, 0);
            } else {
                int var5 = class448.field6514.method305(3, -7985);
                class427.field6264.method2613(0, var5, 0);
            }
            int var8 = class448.field6514.method305(1, -7985);
            if (var8 == 1) {
                class192.field2423[class338.field4509++] = 2047;
            }
        } else {
            if (arg0 <= 2) {
                field489 = null;
            }
            if (var2 == 3) {
                class263.field3592 = class448.field6514.method305(2, -7985);
                int var9 = class448.field6514.method305(1, -7985);
                int var10 = class448.field6514.method305(7, -7985);
                int var11 = class448.field6514.method305(7, -7985);
                int var12 = class448.field6514.method305(1, -7985);
                if (var12 == 1) {
                    class192.field2423[class338.field4509++] = 2047;
                }
                class427.field6264.method853(class263.field3592, (byte) 120, var10, var9 == 1, var11);
            }
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)J")
    public final long method248(int arg0) {
        field496++;
        long[] var2 = class149.field1897;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field501) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field502 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field502 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field490 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != 17473) {
            return -109L;
        }
        long var13 = var2[(int) ((var11 ^ (long) (this.field490 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field490 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field490) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field491) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field494 >> 24) ^ var19) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field494 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field494 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field494 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field499) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field493 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method249(String arg0, int arg1) {
        field503++;
        if (arg0 == null) {
            return;
        }
        String var2 = class88.method482((byte) 109, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class452.field6573; var3++) {
            String var4 = class88.method482((byte) 49, class333.field4427[var3]);
            if (var4 != null && var4.equals(var2)) {
                class452.field6573--;
                for (int var5 = var3; var5 < class452.field6573; var5++) {
                    class333.field4427[var5] = class333.field4427[var5 + 1];
                    class414.field5959[var5] = class414.field5959[var5 + 1];
                    class139.field1782[var5] = class139.field1782[var5 + 1];
                    class80.field893[var5] = class80.field893[var5 + 1];
                    class269.field3654[var5] = class269.field3654[var5 + 1];
                }
                class414.field5966++;
                class36.field378 = class367.field5142;
                class281.field3857.method295(20579, 91);
                class281.field3857.method1386(arg1 - 222840625, class75.method426(28555, arg0));
                class281.field3857.method1343(arg0, 22608);
                break;
            }
        }
        if (arg1 != 1) {
            method245(95);
        }
    }
}
