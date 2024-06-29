import java.awt.Image;
import java.awt.Rectangle;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class96 extends class136 {

    @OriginalMember(owner = "client!mr", name = "E", descriptor = "I")
    private int field1289 = 1;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "I")
    private int field1293 = 204;

    @OriginalMember(owner = "client!mr", name = "D", descriptor = "I")
    private int field1288 = 1;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1292 = new Rectangle[100];

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "Lsl;")
    public static class318 field1295;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1297;

    @OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "Ljava/awt/Image;")
    public static Image field1296;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)V")
    public static final void method828(boolean arg0) {
        field1296 = null;
        class193.field2814 = null;
        if (!arg0) {
            ++field1294;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIZZ)V")
    public static final void method829(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class527.field7754 = arg0;
        class376.field5566 = 1 << class527.field7754;
        class47.field517 = class376.field5566 >> 1;
        class209.field3025 = (int) Math.sqrt((double) (class47.field517 * class47.field517 + class47.field517 * class47.field517));
        class86.field1170 = class376.field5566 >> 2;
        class443.field6569 = class376.field5566;
        class241.field3562 = arg2;
        class497.field7388 = arg3;
        class385.field5672 = arg4;
        class418.field6169 = new class148[arg1][class241.field3562][class497.field7388];
        class283.field4115 = new class142[arg1];
        if (arg5) {
            class394.field5789 = new int[class241.field3562][class497.field7388];
            class453.field6667 = new byte[class241.field3562][class497.field7388];
            class506.field7486 = new byte[class241.field3562][class497.field7388];
            class336.field4678 = new class148[1][class241.field3562][class497.field7388];
            class52.field578 = new class142[1];
        } else {
            class394.field5789 = null;
            class453.field6667 = null;
            class506.field7486 = null;
            class336.field4678 = null;
            class52.field578 = null;
        }
        if (arg6) {
            class270.field3980 = new long[arg1][arg2][arg3];
            class9.field115 = new class521[65535];
            class181.field2543 = new boolean[65535];
            class122.field1791 = 0;
        } else {
            class270.field3980 = null;
            class9.field115 = null;
            class181.field2543 = null;
            class122.field1791 = 0;
        }
        class476.method2876(false);
        class382.field5621 = new class413[1000];
        class209.field3030 = 0;
        class244.field3585 = new class413[1000];
        class299.field4291 = 0;
        class6.field80 = new int[arg1][class241.field3562 + 1][class497.field7388 + 1];
        class481.field7063 = new class431[5000];
        class435.field6376 = 0;
        class350.field4844 = new boolean[class385.field5672 + class385.field5672 + 1][class385.field5672 + class385.field5672 + 1];
        class89.field1221 = new boolean[class385.field5672 + class385.field5672 + 2][class385.field5672 + class385.field5672 + 2];
        class198.field2896 = null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)V")
    public static void method830(int arg0) {
        field1296 = null;
        field1295 = null;
        field1297 = null;
        if (arg0 == 1) {
            field1292 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field1287;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = -107 / ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            for (int var5 = 0; ~class467.field6889 < ~var5; ++var5) {
                int var6 = class453.field6672[var5];
                int var7 = class290.field4168[arg1];
                int var8 = this.field1289 * var6 >> 12;
                int var9 = this.field1288 * var7 >> 12;
                int var10 = var6 % (4096 / this.field1289) * this.field1289;
                int var11 = var7 % (4096 / this.field1288) * this.field1288;
                if (this.field1293 > var11) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var3[var5] = 0;
                        continue;
                    }
                    if (~this.field1293 < ~var10) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field1293) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (~var12 < -4) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var3[var5] = 0;
                        continue;
                    }
                }
                var3[var5] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field1291;
        if (arg0 == 4) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field1293 = arg2.method623((byte) 117);
                    }
                } else {
                    this.field1288 = arg2.method577(255);
                }
            } else {
                this.field1289 = arg2.method577(255);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field1292[var0] = new Rectangle();
        }
        field1295 = new class318(51, 4);
        new class331("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1297 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
