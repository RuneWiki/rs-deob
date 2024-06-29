import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MWZVGOTL")
public class class30 implements Runnable {

    @OriginalMember(owner = "client!MWZVGOTL", name = "b", descriptor = "[I")
    public int[] field988 = new int[500];

    @OriginalMember(owner = "client!MWZVGOTL", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field989 = new Object();

    @OriginalMember(owner = "client!MWZVGOTL", name = "e", descriptor = "Z")
    public boolean field991 = true;

    @OriginalMember(owner = "client!MWZVGOTL", name = "f", descriptor = "[I")
    public int[] field992 = new int[500];

    @OriginalMember(owner = "client!MWZVGOTL", name = "d", descriptor = "Lclient;")
    public client field990;

    @OriginalMember(owner = "client!MWZVGOTL", name = "a", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!MWZVGOTL", name = "<init>", descriptor = "(Lclient;Z)V")
    public class30(client arg0, boolean arg1) {
        this.field990 = arg0;
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "client!MWZVGOTL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field991) {
            Object var1 = this.field989;
            synchronized (this.field989) {
                if (this.field987 < 500) {
                    this.field988[this.field987] = this.field990.field1372;
                    this.field992[this.field987] = this.field990.field1373;
                    this.field987++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
