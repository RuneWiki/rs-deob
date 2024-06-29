import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZRJULOYY")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!ZRJULOYY", name = "a", descriptor = "Z")
    private boolean field1750 = true;

    @OriginalMember(owner = "client!ZRJULOYY", name = "c", descriptor = "[I")
    public int[] field1752 = new int[500];

    @OriginalMember(owner = "client!ZRJULOYY", name = "e", descriptor = "[I")
    public int[] field1754 = new int[500];

    @OriginalMember(owner = "client!ZRJULOYY", name = "f", descriptor = "Z")
    public boolean field1755 = true;

    @OriginalMember(owner = "client!ZRJULOYY", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field1756 = new Object();

    @OriginalMember(owner = "client!ZRJULOYY", name = "d", descriptor = "Lclient;")
    public client field1753;

    @OriginalMember(owner = "client!ZRJULOYY", name = "b", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!ZRJULOYY", name = "<init>", descriptor = "(ILclient;)V")
    public class70(int arg0, client arg1) {
        this.field1753 = arg1;
        if (arg0 != 0) {
            this.field1750 = !this.field1750;
        }
    }

    @OriginalMember(owner = "client!ZRJULOYY", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1755) {
            Object var1 = this.field1756;
            synchronized (this.field1756) {
                if (this.field1751 < 500) {
                    this.field1752[this.field1751] = this.field1753.field1441;
                    this.field1754[this.field1751] = this.field1753.field1442;
                    this.field1751++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
