import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class6 extends OutputStream {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    public static int[] field30 = new int[100];

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[I")
    public static int[] field29 = new int[100];

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field32 = new String[5];

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!vl", name = "write", descriptor = "(I)V", line = 6)
    public final void write(int arg0) throws IOException {
        field35++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V", line = 19)
    public static void method14(boolean arg0) {
        if (arg0) {
            method15(40L, -35);
        }
        field29 = null;
        field32 = null;
        field30 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(JI)V", line = 32)
    public static final void method15(long arg0, int arg1) {
        field31++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 < 43) {
            method16(-120);
        }
        for (int var3 = 0; var3 < class193.field2892; var3++) {
            if (class7.field50[var3] == arg0) {
                class150.field2254++;
                class193.field2892--;
                for (int var4 = var3; var4 < class193.field2892; var4++) {
                    class156.field2347[var4] = class156.field2347[var4 + 1];
                    class255.field3872[var4] = class255.field3872[var4 + 1];
                    class17.field196[var4] = class17.field196[var4 + 1];
                    class7.field50[var4] = class7.field50[var4 + 1];
                    class63.field831[var4] = class63.field831[var4 + 1];
                    class120.field1891[var4] = class120.field1891[var4 + 1];
                }
                class315.field4761 = class225.field3423;
                class234.field3507.method28(92, false);
                class234.field3507.method1816(arg0, 21054);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 87)
    public static final void method16(int arg0) {
        if (arg0 != 24428) {
            field30 = (int[]) null;
        }
        field33++;
        if (class17.field209) {
            class17.field209 = false;
            class163.field2453 = null;
            class97.field1457 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lgl;B)V", line = 109)
    public static final void method17(class262 arg0, byte arg1) {
        class264 var2 = null;
        field34++;
        try {
            class227 var3 = arg0.method1775("runescape", (byte) -21);
            while (var3.field3456 == 0) {
                class93.method662(-553, 1L);
            }
            if (var3.field3456 == 1) {
                var2 = (class264) var3.field3452;
                class263 var4 = class145.method1036(false);
                var2.method1852((byte) 28, 0, var4.field3986, var4.field4025);
            }
        } catch (Exception var9) {
        }
        try {
            if (var2 != null) {
                var2.method1855(0);
            }
            int var6 = -11 % ((arg1 + 68) / 40);
        } catch (Exception var8) {
        }
    }
}
