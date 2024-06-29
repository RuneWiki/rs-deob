import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class55 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "[B")
    public byte[] field564;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "[S")
    public short[] field561;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "[S")
    public short[] field562;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "[S")
    public short[] field563;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 4)
    public static final boolean method306(String arg0, int arg1, int arg2) {
        field560++;
        if (arg2 != 40000) {
            method306(null, 7, -51);
        }
        if (class289.field3549.field7851) {
            class76.field802 = new class444();
            class76.field802.field6435 = arg1;
            class76.field802.field6430 = arg0;
            if (class342.field4425 != class237.field2829) {
                class76.field802.field6431 = class76.field802.field6435 + 50000;
                class76.field802.field6441 = class76.field802.field6435 + 40000;
            }
            if (arg1 < class476.field6778.length && class476.field6778[arg1] != null) {
                class757.field10552 = class476.field6778[arg1].field9076;
            }
            return true;
        }
        String var3 = "";
        if (class342.field4425 != class237.field2829) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class608.field8638 != null) {
            var4 = "/p=" + class608.field8638;
        }
        String var5 = "http://" + arg0 + var3 + "/l=" + class489.field6978 + "/a=" + class519.field7378 + var4 + "/j" + (class226.field2583 ? "1" : "0") + ",o" + (class240.field2854 ? "1" : "0") + ",a2";
        try {
            class30.field343.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }
}
