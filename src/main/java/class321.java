import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class321 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[I")
    public int[] field4092 = new int[6];

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[B")
    public byte[] field4097 = new byte[18002];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[[I")
    public int[][] field4094 = new int[6][258];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[B")
    public byte[] field4089 = new byte[4096];

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field4103 = 0;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[[I")
    public int[][] field4098 = new int[6][258];

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public int field4106 = 0;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "[I")
    public int[] field4102 = new int[256];

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[I")
    public int[] field4111 = new int[16];

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "[B")
    public byte[] field4112 = new byte[256];

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[B")
    public byte[] field4096 = new byte[18002];

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[I")
    public int[] field4108 = new int[257];

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "[Z")
    public boolean[] field4114 = new boolean[256];

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "[[B")
    public byte[][] field4113 = new byte[6][258];

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "[[I")
    public int[][] field4117 = new int[6][258];

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "[Z")
    public boolean[] field4119 = new boolean[16];

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "B")
    public byte field4101;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field4095;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field4099;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
    public int field4118;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "[B")
    public byte[] field4100;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "[B")
    public byte[] field4107;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 20)
    public static final void method1838(byte arg0) {
        field4088++;
        if (class655.field9229 != null) {
            return;
        }
        int var1 = -111 / ((arg0 - 11) / 54);
        Container var2;
        if (class582.field8140 != null) {
            var2 = class582.field8140;
        } else if (class422.field5308 == null) {
            var2 = class678.field9508;
        } else {
            var2 = class422.field5308;
        }
        class95.field1307 = var2.getSize().width;
        class366.field4659 = var2.getSize().height;
        if (class582.field8140 == var2) {
            Insets var3 = class582.field8140.getInsets();
            class95.field1307 -= var3.right + var3.left;
            class366.field4659 -= var3.top + var3.bottom;
        }
        if (class193.method1167(115) == 1) {
            class523.field7111 = class593.field8327;
            class244.field3022 = class316.field4060;
            class193.field2426 = (class95.field1307 - class593.field8327) / 2;
            class267.field3382 = 0;
        } else {
            class50.method316((byte) -10);
        }
        if (class591.field8310 != class1.field9) {
            boolean var10000;
            if (class523.field7111 < 1024 && class244.field3022 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class500.field6585.setSize(class523.field7111, class244.field3022);
        if (class32.field452 != null) {
            class32.field452.method1068(class500.field6585);
        }
        if (class582.field8140 == var2) {
            Insets var4 = class582.field8140.getInsets();
            class500.field6585.setLocation(class193.field2426 + var4.left, var4.top - -class267.field3382);
        } else {
            class500.field6585.setLocation(class193.field2426, class267.field3382);
        }
        if (class316.field4063 != -1) {
            class635.method3557(true, (byte) 114);
        }
        class170.method972(0);
    }
}
