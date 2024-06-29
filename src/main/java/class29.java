import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class29 extends class264 {

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Z")
    public static boolean field408 = false;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "Lvq;")
    public static class24 field416 = new class24(90, 0);

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "Lvq;")
    public static class24 field417;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "Z")
    public static boolean field418;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "J")
    public long field406;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "Lsq;")
    public class29 field407;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "Lsq;")
    public class29 field412;

    static {
        new class409("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        new class409("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field417 = new class24(49, 3);
        field418 = true;
    }

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)Z", line = 7)
    public final boolean method294(int arg0) {
        if (arg0 != 600) {
            this.field412 = null;
        }
        field410++;
        return this.field412 != null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Z", line = 22)
    public static final boolean method295(int arg0, int arg1) {
        field409++;
        if (arg0 != 16565) {
            method297((String) null, (byte) 88);
        }
        if (arg1 == 17 || arg1 == 3 || arg1 == 11 || arg1 == 21 || arg1 == 1001) {
            return true;
        } else {
            return arg1 == 48 || arg1 == 1006;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method296(boolean arg0) {
        class388.field5677.method75(class184.field2598, class317.field4656, class289.field4235);
        field415++;
        if (arg0) {
            method297((String) null, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 64)
    public static final int method297(String arg0, byte arg1) {
        field413++;
        int var2 = arg0.length();
        int var3 = -47 / ((30 - arg1) / 53);
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            var4 = (var4 << 5) - (var4 - class420.method2594(-85, arg0.charAt(var5)));
        }
        return var4;
    }

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V", line = 85)
    public static void method298(int arg0) {
        if (arg0 != 16384) {
            field418 = false;
        }
        field417 = null;
        field416 = null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V", line = 97)
    public final void method299(byte arg0) {
        field414++;
        if (arg0 != -86) {
            this.field412 = null;
        }
        if (this.field412 != null) {
            this.field412.field407 = this.field407;
            this.field407.field412 = this.field412;
            this.field412 = null;
            this.field407 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(BI)V", line = 118)
    public static final void method300(byte arg0, int arg1) {
        field411++;
        int var2 = class388.field5665 - class34.field493;
        if (var2 >= 100) {
            class28.field402 = 1;
            return;
        }
        int var3 = (int) class170.field2220;
        if (class137.field1875 >> 8 > var3) {
            var3 = class137.field1875 >> 8;
        }
        if (class260.field3858[4] && (class14.field229[4] + 128) > var3) {
            var3 = class14.field229[4] + 128;
        }
        if (arg0 != 122) {
            return;
        }
        int var4 = (int) class1.field19 + class146.field1977 & 0x3FFF;
        class429.method2640(var3, class108.field1463, (var3 >> 3) * 3 + 600, arg1, class171.field2236, true, var4, class133.method889(class423.field6117, class187.field2619.field4954, class187.field2619.field4951, false) - 50);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class345.field5077 = (int) ((float) (class345.field5077 - class70.field922) * var5 + (float) class70.field922);
        class164.field2171 = (int) ((float) (class164.field2171 - class371.field5432) * var5 + (float) class371.field5432);
        class298.field4343 = (int) ((float) (class298.field4343 - class281.field4136) * var5 + (float) class281.field4136);
        class103.field1341 = (int) ((float) (class103.field1341 - class77.field982) * var5 + (float) class77.field982);
        int var6 = class136.field1867 - class363.field5256;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class136.field1867 = (int) ((float) var6 * var5 + (float) class363.field5256);
        class136.field1867 &= 0x3FFF;
    }
}
