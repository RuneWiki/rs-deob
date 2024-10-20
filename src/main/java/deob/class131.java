package deob;

import java.util.concurrent.ThreadFactory;

@ObfuscatedName("ev")
public final class class131 implements ThreadFactory {

    public Thread newThread(Runnable arg0) {
        return new Thread(arg0, "OSRS Maya Anim Load");
    }
}
