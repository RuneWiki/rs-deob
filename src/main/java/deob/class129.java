package deob;

import java.util.concurrent.Callable;

@ObfuscatedName("dj")
public class class129 implements Callable {

    // $FF: synthetic field
    public final class134 this$0;

    // $FF: synthetic field
    public final int val$workStart;

    // $FF: synthetic field
    public final int val$workEnd;

    // $FF: synthetic field
    public final class125[] val$curveLoadJobs;

    public class129(class134 arg0, int arg1, int arg2, class125[] arg3) {
        this.this$0 = arg0;
        this.val$workStart = arg1;
        this.val$workEnd = arg2;
        this.val$curveLoadJobs = arg3;
    }

    public Object call() {
        for (int var1 = this.val$workStart; var1 < this.val$workEnd; var1++) {
            this.val$curveLoadJobs[var1].call();
        }
        return null;
    }
}
