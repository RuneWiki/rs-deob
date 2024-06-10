import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!ua")
public abstract class class45 {
   @OriginalMember(
      owner = "loginapplet!ua",
      name = "a",
      descriptor = "[[B"
   )
   public static byte[][] field333 = new byte[50][];
   @OriginalMember(
      owner = "loginapplet!ua",
      name = "b",
      descriptor = "I"
   )
   public static int field334;
   @OriginalMember(
      owner = "loginapplet!ua",
      name = "c",
      descriptor = "Laa;"
   )
   public static class2 field335;
   @OriginalMember(
      owner = "loginapplet!ua",
      name = "d",
      descriptor = "I"
   )
   public static int field336 = 0;

   @OriginalMember(
      owner = "loginapplet!ua",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method218(int arg0);

   @OriginalMember(
      owner = "loginapplet!ua",
      name = "a",
      descriptor = "(IILw;I)Z",
      line = 6
   )
   public static final boolean method219(int arg0, int arg1, class48 arg2, int arg3) {
      try {
         byte[] var4 = arg2.method237(arg1, arg3, true);
         if (null != var4) {
            class7.method28(98, var4);
            int var5 = 98 % ((arg0 - 73) / 36);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "ua.D(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ua",
      name = "a",
      descriptor = "(B)V",
      line = 22
   )
   public static void method220(byte arg0) {
      try {
         if (arg0 <= -22) {
            field333 = (byte[][])null;
            field335 = null;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "ua.C(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ua",
      name = "b",
      descriptor = "(I)Lcb;",
      line = 45
   )
   public static final class9 method221(int arg0) {
      try {
         try {
            if (arg0 != 50) {
               method221(-127);
            }

            return (class9)Class.forName("ba").newInstance();
         } catch (Throwable var2) {
            return new class26();
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ua.E(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!ua",
      name = "a",
      descriptor = "([BI)V"
   )
   public abstract void method222(byte[] arg0, int arg1);

   @OriginalMember(
      owner = "loginapplet!ua",
      name = "a",
      descriptor = "(Ljava/io/File;B)[B",
      line = 70
   )
   public static final byte[] method223(File arg0, byte arg1) {
      try {
         if (arg1 != 36) {
            field335 = (class2)null;
         }

         return class25.method126(arg0, false, (int)arg0.length());
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "ua.F(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }
}
