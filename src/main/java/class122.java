import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class122 {

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public int field2160 = -1;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field2156 = 3353893;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "Lcj;")
    public class351 field2159;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
    public static boolean field2151;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
    public int[] field2153;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field2154;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJ)V", line = 14)
    public static final void method881(int arg0, long arg1) {
        field2158++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class174.method1237(-38, arg1 - 1L);
            class174.method1237(-92, 1L);
        } else {
            class174.method1237(-111, arg1);
        }
        int var3 = -6 / ((arg0 + 18) / 41);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 38)
    public static final void method882(int arg0) {
        field2152++;
        class339 var1 = class317.field5164;
        synchronized (class317.field5164) {
            class94.field1651 = class190.field3228;
            class73.field1339 = class300.field4869;
            class220.field3654++;
            if (arg0 == 1) {
                class26.field662 = class144.field2420;
                class325.field5246 = class356.field5672;
                class37.field807 = class197.field3302;
                class303.field4931 = class12.field376;
                class266.field4346 = class269.field4393;
                class356.field5672 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I[F)[F", line = 75)
    public static final float[] method883(int arg0, float[] arg1) {
        field2157++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class89.method683(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }
}
