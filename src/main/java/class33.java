import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!oa")
public class class33 {
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "a",
      descriptor = "Laa;"
   )
   public static class2 field206;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "b",
      descriptor = "I"
   )
   public static int field207 = 0;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field208 = false;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "d",
      descriptor = "I"
   )
   public static int field209;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field210 = false;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "f",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field211;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "g",
      descriptor = "I"
   )
   public static int field212;
   @OriginalMember(
      owner = "loginapplet!oa",
      name = "h",
      descriptor = "J"
   )
   public static long field213;

   @OriginalMember(
      owner = "loginapplet!oa",
      name = "a",
      descriptor = "(I)V",
      line = 37
   )
   public static void method153(int arg0) {
      try {
         field206 = null;
         if (arg0 > -68) {
            field213 = 26L;
         }

      } catch (RuntimeException var2) {
         throw class28.method139(var2, "oa.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!oa",
      name = "a",
      descriptor = "(ILea;[B)V",
      line = 63
   )
   public final void method154(int arg0, class13 arg1, byte[] arg2) {
      try {
         if (-32 == ~arg1.field102[arg1.field105] && 116 == ~arg1.field102[1 + arg1.field105]) {
            if (arg0 < 35) {
               this.method154(23, (class13)null, (byte[])null);
            }

            if (null == this.field211) {
               this.field211 = new Inflater(true);
            }

            try {
               this.field211.setInput(arg1.field102, arg1.field105 - -10, arg1.field102.length + -18 + -arg1.field105);
               this.field211.inflate(arg2);
            } catch (Exception var5) {
               this.field211.reset();
               throw new RuntimeException("Invalid GZIP compressed data!");
            }

            this.field211.reset();
         } else {
            throw new RuntimeException("Invalid GZIP header!");
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "oa.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!oa",
      name = "<init>",
      descriptor = "(III)V",
      line = 89
   )
   private class33(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "loginapplet!oa",
      name = "<init>",
      descriptor = "()V",
      line = 103
   )
   public class33() {
      this(-1, 1000000, 1000000);
   }
}
