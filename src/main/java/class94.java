import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class class94 {

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Lno;")
    public class658 field1438;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Z")
    private boolean field1441;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "Lgj;")
    public static class593 field1439 = new class593();

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "[I")
    public static int[] field1443 = new int[500];

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "Lgj;")
    public static class593 field1444 = new class593();

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "Lcu;")
    public static class206 field1445 = new class206(10, 8);

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "[I")
    public static int[] field1446 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "Le;")
    public static class498 field1447;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(Z)V", line = 6)
    public static void method738(boolean arg0) {
        field1439 = null;
        field1446 = null;
        field1447 = null;
        if (arg0) {
            field1444 = null;
            field1445 = null;
            field1443 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        field1442++;
        this.field1438.method3602(-25440, this.field1440, this.field1437);
        super.finalize();
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I[BI)V", line = 32)
    public final void method739(int arg0, byte[] arg1, int arg2) {
        this.method741(102);
        field1432++;
        int var4 = -23 / ((arg2 + 35) / 52);
        if (arg0 <= this.field1440) {
            OpenGL.glBufferSubDataARBub(this.field1436, 0, arg0, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field1436, arg0, arg1, 0, this.field1441 ? 35040 : 35044);
            this.field1438.field9203 += arg0 - this.field1440;
            this.field1440 = arg0;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZ)V", line = 56)
    public static final void method740(int arg0, boolean arg1) {
        field1433++;
        if (!class269.method1639(arg0, 0)) {
            return;
        }
        class625[] var2 = class601.field7977[arg0];
        if (arg1) {
            field1446 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class625 var4 = var2[var3];
            if (var4 != null) {
                var4.field8372 = 1;
                var4.field8439 = 0;
                var4.field8321 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z[BZ)V", line = 91)
    public static final void method742(boolean arg0, byte[] arg1, boolean arg2) {
        if (class265.field3687 == null) {
            class265.field3687 = new class335(20000);
        }
        field1435++;
        if (arg2) {
            return;
        }
        class265.field3687.method2004(255, arg1, 0, arg1.length);
        if (!arg0) {
            return;
        }
        class618.method3382(class265.field3687.field4600, (byte) 115);
        class471.field6307 = new class233[class708.field9929];
        int var3 = 0;
        for (int var4 = class340.field4699; var4 <= class442.field6060; var4++) {
            class233 var5 = class31.method259(-1, var4);
            if (var5 != null) {
                class471.field6307[var3++] = var5;
            }
        }
        class291.field4118 = false;
        class71.field1060 = class681.method3802(-23600);
        class265.field3687 = null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 136)
    public static final boolean method743(String arg0, byte arg1) {
        field1434++;
        if (arg1 != -50) {
            field1439 = null;
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class408.field5515; var2++) {
            if (arg0.equalsIgnoreCase(class398.field5296[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class199.field2897.field5398);
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lno;I[BIZ)V", line = 164)
    public class94(class658 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1440 = arg3;
        this.field1438 = arg0;
        this.field1436 = arg1;
        this.field1441 = arg4;
        OpenGL.glGenBuffersARB(1, class116.field1989, 0);
        this.field1437 = class116.field1989[0];
        this.method741(117);
        OpenGL.glBufferDataARBub(arg1, this.field1440, arg2, 0, this.field1441 ? 35040 : 35044);
        this.field1438.field9203 += this.field1440;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lno;ILjaclib/memory/Buffer;IZ)V", line = 187)
    public class94(class658 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1436 = arg1;
        this.field1441 = arg4;
        this.field1438 = arg0;
        this.field1440 = arg3;
        OpenGL.glGenBuffersARB(1, class116.field1989, 0);
        this.field1437 = class116.field1989[0];
        this.method741(118);
        OpenGL.glBufferDataARBa(arg1, this.field1440, arg2.getAddress(), this.field1441 ? 35040 : 35044);
        this.field1438.field9203 += this.field1440;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
    public abstract void method741(int arg0);
}
