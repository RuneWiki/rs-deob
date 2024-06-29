import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class81 extends class281 {

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "Ljava/lang/String;")
    public String field1150;

    @OriginalMember(owner = "client!gea", name = "E", descriptor = "Ldha;")
    public class84 field1155;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "[Ljp;")
    public static class376[] field1149 = new class376[2048];

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "client!gea", name = "B", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!gea", name = "C", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!gea", name = "D", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lha;II)V", line = 5)
    public static final void method681(class65 arg0, int arg1, int arg2) {
        field1152++;
        if (arg1 != 28548) {
            return;
        }
        if (!class522.field7164 || !class791.field10882) {
            class675.field9472 = 0;
            return;
        }
        if (class180.field2389) {
            class682.field9587 = class754.field10482.method1313((byte) 81);
        }
        class337.field4880 = 0;
        class20.field296 = 0;
        class639.field8883 = 0;
        int[] var3 = arg0.method496();
        class566.field7575 = (int) ((float) var3[2] / 3.0F);
        class562.field7545 = (int) ((float) var3[3] / 3.0F);
        arg0.method561(class504.field6976);
        if (((int) ((float) class504.field6976[0] / 3.0F)) != class492.field6819 || ((int) ((float) class504.field6976[1] / 3.0F)) != class598.field8138) {
            class492.field6819 = (int) ((float) class504.field6976[0] / 3.0F);
            class598.field8138 = (int) ((float) class504.field6976[1] / 3.0F);
            class10.field168 = class598.field8138 >> 1;
            class148.field2080 = class492.field6819 >> 1;
            class280.field4140 = new int[class598.field8138 * class492.field6819];
        }
        class481.field6661 = arg0.method565();
        class675.field9472 = 0;
        for (int var4 = 0; var4 < class135.field1988; var4++) {
            class127.method1029((byte) -125, arg2, class517.field7061[var4], arg0);
        }
        for (int var5 = 0; var5 < class665.field9191; var5++) {
            class127.method1029((byte) -100, arg2, class64.field906[var5], arg0);
        }
        for (int var6 = 0; var6 < class743.field10262; var6++) {
            class127.method1029((byte) -114, arg2, class537.field7312[var6], arg0);
        }
        class592.field7964 = 0;
        if (class675.field9472 > 0) {
            int var7 = class280.field4140.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
                class280.field4140[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class280.field4140[var9++] = Integer.MAX_VALUE;
            }
            class626.field8524 = 1;
            for (int var10 = 0; var10 < class675.field9472; var10++) {
                class723 var11 = class268.field3958[var10];
                class419.method2589(var11.field10060[0], var11.field10060[3], var11.field10060[1], var11.field10064[1], 0, var11.field10064[3], var11.field10074[3], var11.field10074[0], var11.field10074[1], var11.field10064[0]);
                class419.method2589(var11.field10060[1], var11.field10060[3], var11.field10060[2], var11.field10064[2], 0, var11.field10064[3], var11.field10074[3], var11.field10074[1], var11.field10074[2], var11.field10064[1]);
            }
            class626.field8524 = 2;
        }
        if (class180.field2389) {
            class229.field3119 = class754.field10482.method1313((byte) 42) - class682.field9587;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)I", line = 114)
    public final int method682(boolean arg0) {
        field1154++;
        if (arg0) {
            return this.field1155.field1176.field4146 == this.field1155.field1176 ? -1 : ((class275) this.field1155.field1176.field4146).field4080;
        } else {
            return 33;
        }
    }

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "(B)V", line = 129)
    public static void method683(byte arg0) {
        if (arg0 != 31) {
            field1149 = null;
        }
        field1149 = null;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILoba;)Z", line = 139)
    public final boolean method684(int arg0, class275 arg1) {
        int var3 = 6 % ((arg0 + 18) / 34);
        field1156++;
        int var4 = this.method682(true);
        arg1.method1811(28064);
        this.field1151--;
        if (this.field1151 != 0) {
            return var4 != this.method682(true);
        }
        this.method792((byte) -99);
        this.method1811(28064);
        class491.field6811--;
        class498.field6877.method1544(true, this, arg1.field4087);
        return false;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(ILoba;)Z", line = 173)
    public final boolean method685(int arg0, class275 arg1) {
        field1153++;
        arg1.method1811(28064);
        boolean var3 = true;
        class275 var4 = (class275) this.field1155.method697(0);
        if (arg0 >= -83) {
            method683((byte) 48);
        }
        while (var4 != null) {
            if (class466.method2755(arg1.field4080, var4.field4080, (byte) 119)) {
                class791.method4362(arg1, var4, -103);
                this.field1151++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var3 = false;
            var4 = (class275) this.field1155.method699(true);
        }
        this.field1155.method695(-98, arg1);
        this.field1151++;
        return var3;
    }

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 204)
    public class81(String arg0) {
        this.field1150 = arg0;
        this.field1155 = new class84();
    }
}
