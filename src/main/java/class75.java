import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class75 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1067 = 0;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[[[I")
    public static int[][][] field1061 = new int[4][13][13];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lrc;")
    public static class67 field1063;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field1069;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[I")
    public int[] field1060;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method510(int arg0, long arg1) {
        field1066++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 != -8950) {
                return null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class192.field3022[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method291(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZLjava/awt/Graphics;III)V")
    public abstract void method292(int arg0, boolean arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method511(byte arg0, String arg1) {
        field1071++;
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = Character.toTitleCase(var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        if (arg0 >= -60) {
            method511((byte) -35, (String) null);
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method512(int arg0) {
        if (arg0 == 4) {
            field1063 = null;
            field1061 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public final void method513(int arg0) {
        if (arg0 == -3) {
            field1064++;
            class127.method867(this.field1060, this.field1065, this.field1068);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public abstract void method295(boolean arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    protected class75() {
    }
}
