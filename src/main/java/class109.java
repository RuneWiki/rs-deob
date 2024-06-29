import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class109 extends class152 {

    @OriginalMember(owner = "client!al", name = "C", descriptor = "Lir;")
    public class28 field1368;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Lrq;")
    public class371 field1367;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1370;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "[Z")
    public static boolean[] field1363;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V", line = 9)
    public final void method878(byte arg0) {
        int var2 = -64 % ((-arg0 - 56) / 36);
        this.field1364 = this.field1368.field425;
        this.field1366 = this.field1368.field432;
        field1369++;
        this.field1365 = this.field1368.field435;
        if (this.field1368.field427 != null) {
            this.field1368.field427.method135(this.field1367.field4668, this.field1367.field4654, this.field1367.field4664, class130.field1614);
        }
        this.field1372 = class130.field1614[2];
        this.field1362 = class130.field1614[0];
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILha;)Lbq;", line = 30)
    public static final class307 method879(int arg0, int arg1, class66 arg2) {
        if (arg1 == -24247) {
            field1371++;
            class705 var3 = class552.method3232(arg0, (byte) -77, arg2, true);
            return var3 == null ? null : var3.field9917;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 50)
    public static void method880(int arg0) {
        field1363 = null;
        field1370 = null;
        int var1 = 10 % ((arg0 + 15) / 59);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lir;Lsia;)V", line = 62)
    public class109(class28 arg0, class766 arg1) {
        this.field1368 = arg0;
        this.field1367 = this.field1368.method268((byte) 54);
        this.method878((byte) 121);
    }
}
