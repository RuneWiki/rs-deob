import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class207 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lrd;")
    public class355 field2668;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lpia;B)V")
    public static final void method1354(class104 arg0, byte arg1) {
        int var2 = -125 / ((arg1 - 34) / 41);
        field2666++;
        arg0.field1478 = null;
        int var3 = arg0.field1479.length;
        for (int var4 = 0; var4 < var3; var4++) {
            arg0.field1479[var4].field1840 = false;
        }
        class345[] var5 = class223.field2890;
        synchronized (class223.field2890) {
            if (class223.field2890.length > var3 && class68.field950[var3] < 200) {
                class223.field2890[var3].method2188((byte) 31, arg0);
                int var10002 = class68.field950[var3]++;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public abstract void method37(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public final void method1355(int arg0, int arg1) {
        if (arg0 != this.method39(arg1, (byte) 69)) {
            this.method41(arg1, (byte) -71);
        }
        field2670++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method1356(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if ((arg1 ? class125.field1721.field5138.method1871(43) : class125.field1721.field5176.method1871(43)) != 0 && arg6 != 0 && class10.field118 < 50 && arg0 != -1) {
            class642.field8649[class10.field118++] = new class183((byte) (arg1 ? 3 : 2), arg0, arg6, arg4, arg7, arg3, arg2, null);
        }
        field2667++;
        int var8 = 86 % ((50 - arg5) / 39);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
    public abstract void method41(int arg0, byte arg1);

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public abstract int method36(int arg0);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)C")
    public static final char method1357(boolean arg0, byte arg1) {
        field2671++;
        int var2 = arg1 & 0xFF;
        if (!arg0) {
            return '\u0002';
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class652.field8796[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IB)I")
    public abstract int method39(int arg0, byte arg1);

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lrd;)V")
    public class207(class355 arg0) {
        this.field2668 = arg0;
        this.field2669 = this.method36(-88);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILrd;)V")
    public class207(int arg0, class355 arg1) {
        this.field2669 = arg0;
        this.field2668 = arg1;
    }
}
