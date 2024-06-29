import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class88 {

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[Lwk;")
    private class145[] field1219 = null;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[Lwk;")
    public class145[] field1220 = null;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "Laga;")
    public class668 field1226 = null;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Laga;")
    public class668 field1222 = null;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lij;")
    private class424 field1217;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "Z")
    public boolean field1225;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Lhg;")
    public static class693 field1221 = new class693(39, -1);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Lnd;")
    public static class547 field1224;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)Z")
    public final boolean method722(byte arg0) {
        if (arg0 != 17) {
            field1221 = null;
        }
        field1216++;
        if (this.field1225) {
            return this.field1222 != null;
        } else {
            return this.field1220 != null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)Z")
    public final boolean method723(boolean arg0) {
        if (!arg0) {
            return true;
        }
        if (this.field1226 == null) {
            if (class631.field8707 == null) {
                byte[] var2 = class287.method1706(0.6F, 0.5F, 16, 8, 4.0F, 16.0F, (byte) -18, new class737(419684), 4.0F, 128, 128);
                class631.field8707 = class431.method2466(93, false, var2);
            }
            byte[] var3 = class98.method784(false, class631.field8707, 3544);
            byte[] var4 = new byte[var3.length * 4];
            int var5 = 0;
            for (int var6 = 0; var6 < 16; var6++) {
                int var7 = var6 * 128 * 128;
                int var8 = var7;
                for (int var9 = 0; var9 < 128; var9++) {
                    int var10 = var9 * 128 + var8;
                    int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                    int var12 = (var9 + 1 & 0x7F) * 128 + var8;
                    for (int var13 = 0; var13 < 128; var13++) {
                        float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                        float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                        float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                        var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                        var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                        var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                        var4[var5++] = var3[var7++];
                    }
                }
            }
            this.field1226 = this.field1217.method2000(16, var4, 128, -121, class269.field3396, 128);
        }
        field1218++;
        return this.field1226 != null;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
    public static void method724(boolean arg0) {
        field1224 = null;
        field1221 = null;
        if (arg0) {
            field1227 = 117;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[[BLsa;)V")
    public static final void method725(int arg0, byte[][] arg1, class207 arg2) {
        field1223++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        if (arg0 < 121) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class461 var11 = new class461(var10);
                int var12 = class201.field2708[var5] >> 8;
                int var13 = class201.field2708[var5] & 0xFF;
                int var14 = var12 * 64 - class332.field4232;
                int var15 = var13 * 64 - class447.field5936;
                class14.method102(true);
                arg2.method2300(class447.field5936, class332.field4232, var11, var14, var15, (byte) 22, class526.field7350);
                arg2.method1339(var3, 0, var14, class386.field4930, var15, var11);
                if (!arg2.field5215 && (class21.field384 / 8) == var12 && (class409.field5196 / 8) == var13 && var3[0] != -1) {
                    class1.field4 = class507.field7153.method3922(var3[0], class623.field8571, var3[2], var3[1], var3[3], 16);
                    class344.field4355 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class201.field2708[var6] >> 8) * 64 - class332.field4232;
            int var8 = (class201.field2708[var6] & 0xFF) * 64 - class447.field5936;
            byte[] var9 = arg1[var6];
            if (var9 == null && class409.field5196 < 800) {
                class14.method102(true);
                arg2.method2297(var7, 64, -125, 64, var8);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lij;)V")
    public class88(class424 arg0) {
        this.field1217 = arg0;
        this.field1225 = this.field1217.field5646;
        if (this.field1225 && !this.field1217.method1993(class331.field4230, class285.field3589, false)) {
            this.field1225 = false;
        }
        if (this.field1225 || this.field1217.method1985(class331.field4230, (byte) 76, class285.field3589)) {
            class566.method3256(128);
            if (this.field1225) {
                byte[] var6 = class98.method784(false, class484.field6945, 3544);
                this.field1222 = this.field1217.method2000(16, var6, 128, -85, class331.field4230, 128);
                byte[] var7 = class98.method784(false, class542.field7496, 3544);
                this.field1217.method2000(16, var7, 128, -92, class331.field4230, 128);
            } else {
                this.field1220 = new class145[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class28.method191(class484.field6945, false, 32768, var2 * 128 * 2 * 128);
                    this.field1220[var2] = this.field1217.method2376(var5, class331.field4230, 128, 128, true, 91);
                }
                this.field1219 = new class145[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class28.method191(class542.field7496, false, 32768, var3 * 128 * 128 * 2);
                    this.field1219[var3] = this.field1217.method2376(var4, class331.field4230, 128, 128, true, 118);
                }
            }
        }
    }
}
