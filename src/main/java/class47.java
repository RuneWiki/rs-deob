import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class class47 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "J")
    public static long field561 = 0L;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lr;IZ)V", line = 4)
    public static final void method246(class562 arg0, int arg1, boolean arg2) {
        field562++;
        if (!class611.field8479) {
            class91.field1111 = 0;
            return;
        }
        if (class174.field2468) {
            class240.field3178 = class419.field5505.method43(-127);
        }
        class209.field2791 = 0;
        class627.field8681 = 0;
        class703.field9878 = 0;
        int[] var3 = arg0.method1110();
        class408.field5368 = (int) ((float) var3[2] / 3.0F);
        class374.field4962 = (int) ((float) var3[3] / 3.0F);
        arg0.method1127(class569.field7756);
        if (((int) ((float) class569.field7756[0] / 3.0F)) != class6.field65 || ((int) ((float) class569.field7756[1] / 3.0F)) != class442.field5873) {
            class442.field5873 = (int) ((float) class569.field7756[1] / 3.0F);
            class6.field65 = (int) ((float) class569.field7756[0] / 3.0F);
            class329.field4422 = class6.field65 >> 1;
            class195.field2676 = class442.field5873 >> 1;
            class429.field5777 = new int[class6.field65 * class442.field5873];
        }
        class419.field5504 = arg0.method1136();
        class91.field1111 = 0;
        if (arg2) {
            return;
        }
        for (int var4 = 0; var4 < class408.field5370; var4++) {
            class557.method3099(arg0, class642.field8877[var4], (byte) -92, arg1);
        }
        for (int var5 = 0; var5 < class174.field2469; var5++) {
            class557.method3099(arg0, class688.field9712[var5], (byte) -76, arg1);
        }
        for (int var6 = 0; var6 < class113.field1433; var6++) {
            class557.method3099(arg0, class64.field805[var6], (byte) -96, arg1);
        }
        class469.field6278 = 0;
        if (class91.field1111 > 0) {
            int var7 = class429.field5777.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
                class429.field5777[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class429.field5777[var9++] = Integer.MAX_VALUE;
            }
            class585.field8079 = 1;
            for (int var10 = 0; var10 < class91.field1111; var10++) {
                class152 var11 = class50.field584[var10];
                class234.method1447(var11.field2087[1], var11.field2086[1], var11.field2081[1], var11.field2081[3], var11.field2086[3], !arg2, var11.field2086[0], var11.field2087[0], var11.field2087[3], var11.field2081[0]);
                class234.method1447(var11.field2087[2], var11.field2086[2], var11.field2081[2], var11.field2081[3], var11.field2086[3], true, var11.field2086[1], var11.field2087[1], var11.field2087[3], var11.field2081[1]);
            }
            class585.field8079 = 2;
        }
        if (class174.field2468) {
            class622.field8628 = class419.field5505.method43(-128) - class240.field3178;
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(IJ)I", line = 116)
    public final int method248(int arg0, long arg1) {
        field563++;
        long var4 = this.method251(-128);
        if (arg0 > -115) {
            return 46;
        } else {
            if (var4 > 0L) {
                class588.method3253(0, var4);
            }
            return this.method247(3, arg1);
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IJ)I")
    public abstract int method247(int arg0, long arg1);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V")
    public abstract void method249(boolean arg0);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)J")
    public abstract long method250(int arg0);

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)J")
    public abstract long method251(int arg0);
}
