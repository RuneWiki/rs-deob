import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class446 {

    @OriginalMember(owner = "client!as", name = "k", descriptor = "B")
    private byte field6164;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public int field6166;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public int field6162;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public int field6168;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field6161;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
    public static int[] field6155 = new int[100];

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field6163 = -1;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field6167 = -1;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z")
    public static final boolean method2594(int arg0) {
        if (arg0 != 100) {
            method2599(20, (class99) null);
        }
        field6156++;
        try {
            return class338.method2008(-7371);
        } catch (IOException var4) {
            class282.method1754((byte) 122);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class255.field3570 == null ? -1 : class255.field3570.method413((byte) -69)) + "," + (class472.field6619 == null ? -1 : class472.field6619.method413((byte) -79)) + "," + (class7.field129 == null ? -1 : class7.field129.method413((byte) -88)) + " - " + class7.field136 + "," + (class153.field2204 + class2.field21.field1144[0]) + "," + (class325.field4472 + class2.field21.field1140[0]) + " - ";
            for (int var3 = 0; class7.field136 > var3 && var3 < 50; var3++) {
                var2 = var2 + class388.field5458.field5886[var3] + ",";
            }
            class181.method1190((byte) 127, var2, var5);
            class166.method1021(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
    public final int method2595(byte arg0) {
        field6160++;
        if (arg0 != 112) {
            field6167 = 21;
        }
        return (this.field6164 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V")
    public static final void method2596(byte arg0, int arg1) {
        field6157++;
        class265 var2 = class440.method2554(arg1, 2, 16);
        var2.method1677(21748);
        if (arg0 >= -119) {
            field6155 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
    public final int method2597(int arg0) {
        if (arg0 < 121) {
            method2598(-60);
        }
        field6159++;
        return this.field6164 & 0x7;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V")
    public static void method2598(int arg0) {
        if (arg0 != -51) {
            field6167 = -92;
        }
        field6155 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILde;)V")
    public static final void method2599(int arg0, class99 arg1) {
        field6165++;
        arg1.field1394 = null;
        if (class299.field4116 < arg0) {
            class191.field2722.method2817(false, arg1);
            class299.field4116++;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
    public class446() {
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
    public static final void method2600(byte arg0) {
        field6154++;
        if (class148.field2091 || arg0 != 121) {
            return;
        }
        class30.method241(true, class5.field110);
        if (class96.field1366 != null) {
            class30.method241(true, class96.field1366);
        }
        class148.field2091 = true;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Llk;)V")
    public class446(class425 arg0) {
        this.field6164 = arg0.method2480(-8315);
        this.field6166 = arg0.method2508(true);
        this.field6162 = arg0.method2502((byte) -86);
        this.field6168 = arg0.method2502((byte) -86);
        this.field6161 = arg0.method2502((byte) -86);
        this.field6158 = arg0.method2502((byte) -86);
    }
}
