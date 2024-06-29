import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class52 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field600 = -1;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Ltg;")
    public static class345 field609 = new class345();

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lhi;")
    public static class323 field610;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method312(int arg0, boolean arg1) {
        class254.field4026 = new int[104];
        class300.field4685 = new int[5];
        class72.field893 = new int[104];
        class174.field2629 = new int[104];
        class303.field4731 = 99;
        if (arg0 != 4) {
            method313(false, (float[]) null);
        }
        field601++;
        class42.field474 = new int[104];
        class84.field1093 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class254.field4018 = new byte[var2][104][104];
        class111.field1554 = new byte[var2][104][104];
        class110.field1519 = new byte[var2][104][104];
        class168.field2578 = new byte[var2][104][104];
        class300.field4687 = new byte[var2][105][105];
        class28.field337 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z[F)[F", line = 39)
    public static final float[] method313(boolean arg0, float[] arg1) {
        field608++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            return (float[]) null;
        } else {
            float[] var2 = new float[arg1.length];
            class8.method48(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 70)
    public static void method314(int arg0) {
        field609 = null;
        if (arg0 == -1) {
            field610 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 98)
    public static final void method315(int arg0, Component arg1) {
        field607++;
        if (arg0 >= -44) {
            field603 = 6;
        }
        Method var2 = class22.field264;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class188.field2839);
        arg1.addFocusListener(class188.field2839);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 121)
    public static final void method316(int arg0) {
        field606++;
        if ((class336.field5351 < class336.field5349)) {
            class336.field5351 = (float) ((double) class336.field5351 / 30.0D + (double) class336.field5351);
            if (class336.field5349 < class336.field5351) {
                class336.field5351 = class336.field5349;
            }
            class349.method2424((byte) 112);
        } else if (class336.field5349 < class336.field5351) {
            class336.field5351 = (float) ((double) class336.field5351 - (double) class336.field5351 / 30.0D);
            if (class336.field5349 > class336.field5351) {
                class336.field5351 = class336.field5349;
            }
            class349.method2424((byte) 122);
        }
        if (class311.field4880 != -1 && class168.field2579 != -1) {
            int var1 = class311.field4880 - class315.field4950;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class168.field2579 - class63.field752;
            class315.field4950 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class63.field752 += var2;
            if (var1 == 0 && var2 == 0) {
                class311.field4880 = -1;
                class168.field2579 = -1;
            }
            class349.method2424((byte) 119);
        }
        if (arg0 >= class294.field4634) {
            class277.field4353 = -1;
            class75.field971 = -1;
        } else {
            class162.field2489--;
            if (class162.field2489 == 0) {
                class162.field2489 = 100;
                class294.field4634--;
            }
        }
        if (!class246.field3867 || class233.field3526 == null) {
            return;
        }
        for (class65 var3 = (class65) class233.field3526.method1812(1); var3 != null; var3 = (class65) class233.field3526.method1809(arg0 ^ 0x80)) {
            class103 var4 = class79.method521(var3.field789.field2735, -76);
            if (class361.field5711 == 0 && var3.method396(Integer.MAX_VALUE, class197.field3009, class128.field1873)) {
                if (!var3.field789.field2748) {
                    var3.field789.field2748 = true;
                    class162.method1171((byte) -44, 15, var3.field789.field2735, var4.field1397);
                }
                if (var3.field789.field2748) {
                    class162.method1171((byte) -114, 17, var3.field789.field2735, var4.field1397);
                }
            } else if (var3.field789.field2748) {
                var3.field789.field2748 = false;
                class162.method1171((byte) 126, 16, var3.field789.field2735, var4.field1397);
            }
        }
    }
}
