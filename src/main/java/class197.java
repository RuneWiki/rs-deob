import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class197 {

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public int field3107 = 0;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[F")
    public float[] field3102 = new float[5000];

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public int field3099 = 0;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[B")
    public byte[] field3108 = new byte[5000];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public volatile int field3106 = 0;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public volatile int field3104 = 0;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field3112 = new Object[5000];

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[I")
    public static int[] field3100 = new int[2];

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Loe;")
    public static class127 field3105 = new class127(101, 8);

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3110 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1222(int arg0) {
        class26.field340 = null;
        field3111++;
        class85.method599(0, class482.field7368, 0, class375.field5475, 0, class147.field2384, 0, false, -1);
        if (arg0 != -15611) {
            field3100 = null;
        }
        if (class26.field340 != null) {
            class202.method1256(class147.field2384, -1412584499, class332.field4974.field6232, (byte) -101, class481.field7345, 0, class482.field7368, class14.field203, 0, class26.field340);
            class26.field340 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIII)V", line = 26)
    public static final void method1223(boolean arg0, int arg1, int arg2, int arg3) {
        field3103++;
        if (arg2 < arg3 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class170.field2646 = arg2;
        class88.field1551 = arg1;
        class236.field3576 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 41)
    public static final void method1224(int arg0) {
        field3109++;
        if (class201.field3190 != null) {
            return;
        }
        Container var1;
        if (class174.field2726 == null) {
            var1 = class7.field86.field3929;
        } else {
            var1 = class174.field2726;
        }
        class135.field2212 = var1.getSize().width;
        class292.field4453 = var1.getSize().height;
        if (class174.field2726 == var1) {
            Insets var2 = class174.field2726.getInsets();
            class135.field2212 -= var2.left + var2.right;
            class292.field4453 -= var2.top + var2.bottom;
        }
        if (class331.method2058(-5576) == 1) {
            class483.field7376 = (class135.field2212 - class415.field6013) / 2;
            class482.field7368 = class415.field6013;
            class411.field5963 = 0;
            class147.field2384 = class7.field83;
        } else if (class322.field4841 < 96 && class30.field395 == 0) {
            int var3 = class135.field2212 > 1024 ? 1024 : class135.field2212;
            class483.field7376 = (class135.field2212 - var3) / 2;
            class482.field7368 = var3;
            int var4 = class292.field4453 <= 768 ? class292.field4453 : 768;
            class411.field5963 = 0;
            class147.field2384 = var4;
        } else {
            class147.field2384 = class292.field4453;
            class411.field5963 = 0;
            class482.field7368 = class135.field2212;
            class483.field7376 = 0;
        }
        if (class77.field1378 != class230.field3507) {
            boolean var10000;
            if (class482.field7368 < 1024 && class147.field2384 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class257.field3919.setSize(class482.field7368, class147.field2384);
        if (class345.field5116 != null) {
            class345.field5116.method1901(class257.field3919);
        }
        if (class174.field2726 == var1) {
            Insets var5 = class174.field2726.getInsets();
            class257.field3919.setLocation(class483.field7376 + var5.left, class411.field5963 + var5.top);
        } else {
            class257.field3919.setLocation(class483.field7376, class411.field5963);
        }
        if (class375.field5475 != -1) {
            class440.method2568(true, arg0 ^ 0xFFFFFF81);
        }
        if (arg0 != -1) {
            field3110 = null;
        }
        class365.method2208((byte) -99);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V", line = 176)
    public static void method1225(int arg0) {
        field3110 = null;
        field3100 = null;
        if (arg0 <= 93) {
            field3100 = null;
        }
        field3105 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
    public abstract void method855(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public abstract void method860(boolean arg0);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
    public abstract void method859(int arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Loh;I)V")
    public abstract void method857(class268 arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public abstract void method858(byte arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLoh;)V")
    public abstract void method862(byte arg0, class268 arg1);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Loh;I)V")
    public abstract void method864(class268 arg0, int arg1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIFLfo;Z)V")
    public abstract void method856(int arg0, int arg1, float arg2, class343 arg3, boolean arg4);
}
