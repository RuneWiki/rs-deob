import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class113 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[S")
    public static short[] field1776 = new short[256];

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1781 = 0;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1779 = 100;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "[I")
    public static int[] field1780 = new int[14];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[[[B")
    public static byte[][][] field1782;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)V")
    public static final void method834(int arg0, byte arg1) {
        class242.field3748 = 20;
        field1775++;
        class217.field3414 = 3;
        if (arg1 != -81) {
            field1781 = -53;
        }
        class36.field578 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)La;")
    public static final class49 method835(byte arg0) {
        field1783++;
        int var1 = class270.field4281[0] * class107.field1717[0];
        byte[] var2 = class289.field4554[0];
        class49 var6;
        if (class186.field2809[0]) {
            byte[] var3 = class256.field3933[0];
            int[] var4 = new int[var1];
            for (int var5 = 0; var5 < var1; var5++) {
                var4[var5] = class115.method840(class35.field560[class3.method48(255, var2[var5])], class3.method48(var3[var5] << 24, -16777216));
            }
            var6 = new class213(class205.field3187, class174.field2581, class184.field2764[0], class239.field3698[0], class270.field4281[0], class107.field1717[0], var4);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class35.field560[class3.method48(var2[var8], 255)];
            }
            var6 = new class49(class205.field3187, class174.field2581, class184.field2764[0], class239.field3698[0], class270.field4281[0], class107.field1717[0], var7);
        }
        class239.method1619(65306);
        if (arg0 != -52) {
            field1777 = 13;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method836(int arg0) {
        if (arg0 != -2058002824) {
            field1784 = 122;
        }
        field1780 = null;
        field1776 = null;
        field1782 = null;
    }
}
