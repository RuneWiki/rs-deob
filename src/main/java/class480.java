import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class480 {

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field6918;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Ljava/lang/String;")
    public String field6917;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[S")
    public static short[] field6913 = new short[256];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field6914 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZIIZI)V", line = 5)
    public static final void method2884(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (class168.field2489 != null && (arg5 != 3 || class193.field3258.field7223 != arg2 || class193.field3258.field7231 != arg0)) {
            class366.method2289((byte) 74, class360.field5349, class168.field2489);
            class168.field2489 = null;
        }
        field6916++;
        if (arg5 == 3 && class168.field2489 == null) {
            class168.field2489 = class124.method918(-54, 0, class360.field5349, 0, arg2, arg0);
            if (class168.field2489 != null) {
                class193.field3258.field7231 = arg0;
                class193.field3258.field7223 = arg2;
                class193.field3258.method933((byte) 78, class360.field5349);
            }
        }
        if (arg5 == 3 && class168.field2489 == null) {
            method2884(-1, true, -1, arg3, true, class193.field3258.field7214);
            return;
        }
        Container var6;
        if (class168.field2489 != null) {
            var6 = class168.field2489;
            class173.field2593 = arg0;
            class468.field6769 = arg2;
        } else if (class281.field4281 == null) {
            var6 = class360.field5349.field5199;
            class468.field6769 = var6.getSize().width;
            class173.field2593 = var6.getSize().height;
        } else {
            Insets var7 = class281.field4281.getInsets();
            class468.field6769 = class281.field4281.getSize().width - var7.left - var7.right;
            int var10001 = var7.top + var7.bottom;
            class173.field2593 = class281.field4281.getSize().height - var10001;
            var6 = class281.field4281;
        }
        if (arg5 == 1) {
            class76.field1105 = class498.field7160;
            class415.field6197 = 0;
            class80.field1163 = class374.field5608;
            class13.field195 = (class468.field6769 - class374.field5608) / 2;
        } else if (class494.field7129 < 96 && class96.field1384 == 0) {
            int var8 = class468.field6769 > 1024 ? 1024 : class468.field6769;
            class13.field195 = (class468.field6769 - var8) / 2;
            int var9 = class173.field2593 <= 768 ? class173.field2593 : 768;
            class80.field1163 = var8;
            class76.field1105 = var9;
            class415.field6197 = 0;
        } else {
            class415.field6197 = 0;
            class76.field1105 = class173.field2593;
            class13.field195 = 0;
            class80.field1163 = class468.field6769;
        }
        if (class310.field4662 != class125.field1855) {
            boolean var10000;
            if (class80.field1163 < 1024 && class76.field1105 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class257.method1713(-18979);
        } else {
            class111.field1557.setSize(class80.field1163, class76.field1105);
            class377.field5692.method274(class111.field1557);
            if (class281.field4281 == var6) {
                Insets var10 = class281.field4281.getInsets();
                class111.field1557.setLocation(class13.field195 + var10.left, var10.top - -class415.field6197);
            } else {
                class111.field1557.setLocation(class13.field195, class415.field6197);
            }
        }
        if (arg5 >= 2) {
            class8.field120 = true;
        } else {
            class8.field120 = false;
        }
        if (class155.field2310 != -1) {
            class128.method939(465824240, true);
        }
        if (class162.field2413 != null && class378.method2378(9, class429.field6373)) {
            class146.method1033(true);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class277.field4219[var11] = true;
        }
        class500.field7178 = arg4;
    }

    @OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;", line = 162)
    public final String toString() {
        field6912++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 173)
    public class480(String arg0, int arg1) {
        this.field6918 = arg1;
        this.field6917 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 184)
    public static void method2885(int arg0) {
        field6913 = null;
        int var1 = -40 % ((-arg0 - 3) / 60);
    }
}
