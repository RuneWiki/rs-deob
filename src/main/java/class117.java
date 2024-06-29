import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class117 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Z")
    public static boolean field2474 = false;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field2471 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lrf;")
    public static class163 field2475 = class53.method392(113, "gleiten:");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lrf;")
    public static class163 field2478 = class53.method392(-46, ":assist:");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2476 = 0;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[[S")
    public static short[][] field2481;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lu;B)V")
    public static final void method804(class184 arg0, byte arg1) {
        field2473++;
        if (arg1 > -18) {
            method805(114);
        }
        class32.field636 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method805(int arg0) {
        field2478 = null;
        field2475 = null;
        field2481 = null;
        if (arg0 <= 68) {
            method806(120, 3);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method806(int arg0, int arg1) {
        field2477++;
        if (arg0 == 100 && class55.field1116 > 0) {
            byte[] var2 = class142.field2915[--class55.field1116];
            class142.field2915[class55.field1116] = null;
            return var2;
        } else if (arg0 == 5000 && class20.field354 > 0) {
            byte[] var3 = class65.field1388[--class20.field354];
            class65.field1388[class20.field354] = null;
            return var3;
        } else if (~arg0 == arg1 && class116.field2450 > 0) {
            byte[] var4 = class39.field801[--class116.field2450];
            class39.field801[class116.field2450] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method807(int arg0) {
        field2480++;
        if (~class202.field3984 < arg0) {
            class39.method245((byte) 97);
        } else {
            class84.method589(40, -26);
            class81.field1629 = class92.field2004;
            class92.field2004 = null;
        }
    }
}
