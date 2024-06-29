import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class53 {

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    public static int field168 = 1;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "Lhb;")
    public static class32 field171 = new class32();

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "Lwa;")
    public static class75 field174 = class66.method560(")3)3)3", false);

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "Lwa;")
    public static class75 field177 = class66.method560(": ", false);

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "Lwa;")
    public static class75 field175 = class66.method560("Benutzeroberfl-=che geladen)3", false);

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "Lwa;")
    public static class75 field180 = class66.method560(" (X", false);

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Lva;")
    public static class137 field179;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = 81 / ((76 - arg1) / 42);
        field165++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class269.field4644; var8++) {
                var5[var8] = this.field178;
                var6[var8] = this.field164;
                var7[var8] = this.field167;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 55)
    public class13() {
        this(0);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V", line = 62)
    private class13(int arg0) {
        super(0, false);
        this.method68(-171000444, arg0);
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)V", line = 71)
    public static final void method67(int arg0, int arg1) {
        if (arg0 != 0) {
            method67(-88, -5);
        }
        field170++;
        if (class113.field1918 == null || arg1 > class113.field1918.length) {
            class113.field1918 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILja;Z)V", line = 86)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field173++;
        if (!arg2) {
            field180 = (class75) null;
        }
        if (arg0 == 0) {
            this.method68(-171000444, arg1.method489(-100));
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)V", line = 120)
    private final void method68(int arg0, int arg1) {
        this.field164 = (arg1 & 0xFF00) >> 4;
        this.field178 = (arg1 & 0xFF0000) >> 12;
        if (arg0 == -171000444) {
            field172++;
            this.field167 = arg1 & 0xFF << 4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 133)
    public static void method69(int arg0) {
        field174 = null;
        field171 = null;
        if (arg0 != -24995) {
            field177 = (class75) null;
        }
        field180 = null;
        field177 = null;
        field175 = null;
        field179 = null;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(III)V", line = 154)
    public static final void method70(int arg0, int arg1, int arg2) {
        field166++;
        class233 var3 = class237.method1721(arg2, 72);
        int var4 = var3.field3948;
        int var5 = var3.field3946;
        int var6 = var3.field3945;
        int var7 = class273.field4719[var4 - var5];
        if (arg1 > arg0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class286.method2013(class286.field4920[var6] & ~var8 | arg0 << var5 & var8, var6, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIII)V", line = 178)
    public static final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class82.field1368 = arg2;
        class155.field2651 = arg3;
        if (arg0 != 16711680) {
            field176 = -45;
        }
        class287.field4934 = arg1;
        field169++;
        class69.field1182 = arg4;
        class145.field2502 = arg5;
    }
}
