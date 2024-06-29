import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YNDLJDLS")
public class class70 implements Runnable {

    @OriginalMember(owner = "client!YNDLJDLS", name = "a", descriptor = "[I")
    public int[] field1710 = new int[500];

    @OriginalMember(owner = "client!YNDLJDLS", name = "c", descriptor = "Z")
    public boolean field1712 = true;

    @OriginalMember(owner = "client!YNDLJDLS", name = "e", descriptor = "[I")
    public int[] field1714 = new int[500];

    @OriginalMember(owner = "client!YNDLJDLS", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1715 = new Object();

    @OriginalMember(owner = "client!YNDLJDLS", name = "d", descriptor = "Lclient;")
    public client field1713;

    @OriginalMember(owner = "client!YNDLJDLS", name = "b", descriptor = "I")
    public int field1711;

    @OriginalMember(owner = "client!YNDLJDLS", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1712) {
            Object var1 = this.field1715;
            synchronized (this.field1715) {
                if (this.field1711 < 500) {
                    this.field1714[this.field1711] = this.field1713.field1272;
                    this.field1710[this.field1711] = this.field1713.field1273;
                    this.field1711++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!YNDLJDLS", name = "<init>", descriptor = "(Lclient;B)V")
    public class70(client arg0, byte arg1) {
        this.field1713 = arg0;
        if (arg1 != 8) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }
}
