import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class87 extends class72 {

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    public int field1938 = 1000;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field1933 = 0;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lec;")
    public static class28 field1941 = class28.method210(-46, "k");

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Lec;")
    public static class28 field1937 = class28.method210(-46, ")2");

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lec;")
    public static class28 field1944 = class28.method210(-46, "To start a subscripton:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WStart a new subscription(W");

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "[I")
    public static int[] field1935;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lec;IILjava/awt/Color;)V")
    public static final void method644(class28 arg0, int arg1, int arg2, Color arg3) {
        if (class117.field2492) {
            class117.field2492 = false;
            class117.field2493.setColor(Color.black);
            class117.field2493.fillRect(0, 0, class126.field2726, class56.field1286);
        }
        if (arg2 != 27429) {
            return;
        }
        field1943++;
        if (arg3 == null) {
            arg3 = new Color(140, 17, 17);
        }
        if (class122.field2656 == null) {
            class122.field2656 = class94.method677((byte) 6).createImage(304, 34);
        }
        Graphics var4 = class122.field2656.getGraphics();
        var4.setColor(arg3);
        var4.drawRect(0, 0, 303, 33);
        var4.fillRect(2, 2, arg1 * 3, 30);
        var4.setColor(Color.black);
        var4.drawRect(1, 1, 301, 31);
        var4.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
        var4.setFont(class45.field958);
        var4.setColor(Color.white);
        arg0.method226(22, -108, (304 - arg0.method235((byte) -91, class62.field1392)) / 2, var4);
        class117.field2493.drawImage(class122.field2656, class126.field2726 / 2 - 152, class56.field1286 / 2 + -18, null);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Lfb;")
    public class33 method290(int arg0) {
        int var2 = 11 / ((-arg0 - 70) / 55);
        field1942++;
        return null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILec;Lec;I)V")
    public static final void method645(int arg0, class28 arg1, class28 arg2, int arg3) {
        field1945++;
        if (arg3 == 0 && class1.field13 != -1) {
            class40.field868 = 0;
            class64.field1416 = arg1;
        }
        int var4 = -121 % ((54 - arg0) / 39);
        if (class110.field2325 == -1) {
            class95.field2092 = true;
        }
        for (int var5 = 99; var5 > 0; var5--) {
            class22.field501[var5] = class22.field501[var5 - 1];
            class125.field2705[var5] = class125.field2705[var5 - 1];
            class117.field2500[var5] = class117.field2500[var5 - 1];
        }
        class22.field501[0] = arg3;
        class125.field2705[0] = arg2;
        class117.field2500[0] = arg1;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
    public static final void method646(int arg0) {
        field1940++;
        if (class106.field2239 != null) {
            class106.field2239.method104(true);
        }
        class106.field2239 = null;
        class36.method299((byte) 118);
        class11.field179.method768();
        for (int var1 = 0; var1 < 4; var1++) {
            class43.field922[var1].method835(-55);
        }
        System.gc();
        class66.method534(112, 10);
        class47.field1074 = -1;
        class7.field121 = arg0;
        class74.method574(0, 10);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIII)V")
    public void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1936++;
        class33 var10 = this.method290(-128);
        if (var10 != null) {
            this.field1938 = var10.field1938;
            var10.method264(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(Z)V")
    public static void method647(boolean arg0) {
        if (arg0) {
            field1937 = null;
        }
        field1937 = null;
        field1941 = null;
        field1944 = null;
        field1935 = null;
    }
}
