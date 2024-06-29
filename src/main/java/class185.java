import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class185 extends class301 {

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Z")
    public static boolean field3178 = false;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V", line = 15)
    public static final void method1302(byte arg0) {
        field3177++;
        if (class125.field2205 != null) {
            class125.field2205.method136((byte) 92);
        }
        if (class96.field1746 != null) {
            class96.field1746.method136((byte) 92);
        }
        class53.method465(2, 22050, class277.field4519, (byte) -112);
        class125.field2205 = class153.method1088(class59.field1164, class209.field3489, -6764, 22050, 0);
        int var1 = -88 % ((arg0 - 36) / 33);
        class125.field2205.method142(class190.field3225, false);
        class96.field1746 = class153.method1088(class59.field1164, class209.field3489, -6764, 2048, 1);
        class96.field1746.method142(class56.field1105, false);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method857(int arg0);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)Z")
    public abstract boolean method858(int arg0);
}
