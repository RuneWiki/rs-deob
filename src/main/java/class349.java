import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class349 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public int field4546 = 0;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "[[I")
    public int[][] field4562 = new int[6][258];

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "[[I")
    public int[][] field4555 = new int[6][258];

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "[I")
    public int[] field4563 = new int[257];

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "[Z")
    public boolean[] field4570 = new boolean[16];

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "[B")
    public byte[] field4569 = new byte[18002];

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "[Z")
    public boolean[] field4559 = new boolean[256];

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "[[I")
    public int[][] field4547 = new int[6][258];

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public int field4557 = 0;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "[B")
    public byte[] field4553 = new byte[18002];

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "[[B")
    public byte[][] field4568 = new byte[6][258];

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "[I")
    public int[] field4552 = new int[16];

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "[I")
    public int[] field4575 = new int[256];

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "[B")
    public byte[] field4573 = new byte[4096];

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "[B")
    public byte[] field4579 = new byte[256];

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "[I")
    public int[] field4576 = new int[6];

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field4567 = 104;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "[S")
    public static short[] field4571 = new short[256];

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "B")
    public byte field4581;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public int field4558;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public int field4560;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public int field4561;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public int field4572;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "[B")
    public byte[] field4578;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "[B")
    public byte[] field4582;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1935(int arg0) {
        field4574++;
        String var1 = "www";
        if (arg0 != 16262) {
            return null;
        }
        if (class73.field771 == class680.field9644) {
            var1 = "www-wtrc";
        } else if (class73.field771 == class223.field2811) {
            var1 = "www-wtqa";
        } else if (class73.field771 == class156.field1739) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class68.field738 != null) {
            var2 = "/p=" + class68.field738;
        }
        return "http://" + var1 + "." + class220.field2668.field2513 + ".com/l=" + class226.field2899 + "/a=" + class559.field7965 + var2 + "/";
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    public static void method1936(int arg0) {
        if (arg0 == 256) {
            field4571 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)Z")
    public static final boolean method1937(byte arg0, int arg1, int arg2) {
        if (arg0 != 19) {
            method1937((byte) -73, 32, 55);
        }
        field4550++;
        return class214.method1276(arg1, arg2, -65537) & class136.method765((byte) 98, arg2, arg1);
    }
}
