import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class432 {
   @OriginalMember(
      owner = "client!dg",
      name = "e",
      descriptor = "Ldw;"
   )
   private class748 field6602 = new class748(128);
   @OriginalMember(
      owner = "client!dg",
      name = "h",
      descriptor = "Ldw;"
   )
   public class748 field6603 = new class748(64);
   @OriginalMember(
      owner = "client!dg",
      name = "j",
      descriptor = "Leaa;"
   )
   public class526 field6600;
   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "Leaa;"
   )
   private class526 field6596;
   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6606 = new String[]{method3296(method3295("\u0006~9\\X")), method3296(method3295("\u0006~9XX")), method3296(method3295("\u0006~9[X")), method3296(method3295("\u0006~9YX")), method3296(method3295("\u0019794\r")), method3296(method3295("\fl{v")), method3296(method3295("\u0006~9]X")), method3296(method3295("\u0006~9^X")), method3296(method3295("\u0006~9_X")), method3296(method3295("\u0006~9&\u0019\fpc$X"))};
   @OriginalMember(
      owner = "client!dg",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field6594 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!dg",
      name = "g",
      descriptor = "I"
   )
   public static int field6595;
   @OriginalMember(
      owner = "client!dg",
      name = "c",
      descriptor = "I"
   )
   public static int field6597;
   @OriginalMember(
      owner = "client!dg",
      name = "f",
      descriptor = "I"
   )
   public static int field6598;
   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "I"
   )
   public static int field6599;
   @OriginalMember(
      owner = "client!dg",
      name = "i",
      descriptor = "I"
   )
   public static int field6601;
   @OriginalMember(
      owner = "client!dg",
      name = "d",
      descriptor = "I"
   )
   public static int field6605;
   @OriginalMember(
      owner = "client!dg",
      name = "k",
      descriptor = "Lat;"
   )
   public static class396 field6604;

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3288(byte arg0) {
      try {
         ++field6605;
         class748 var2 = this.field6602;
         synchronized(this.field6602) {
            this.field6602.method5445(697465426);
            if (arg0 != 116) {
               field6594 = null;
            }
         }

         class748 var3 = this.field6603;
         synchronized(this.field6603) {
            this.field6603.method5445(697465426);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6606[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(BLjava/awt/Component;)Lop;"
   )
   public static final class200 method3289(byte arg0, Component arg1) {
      try {
         ++field6598;
         return arg0 != -75 ? null : new class339(arg1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6606[3] + arg0 + ',' + (arg1 != null ? field6606[4] : field6606[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3290(int arg0) {
      try {
         field6594 = null;
         field6604 = null;
         if (arg0 != 4) {
            method3289((byte)61, (Component)null);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6606[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3291(boolean arg0) {
      try {
         class748 var2 = this.field6602;
         synchronized(this.field6602) {
            this.field6602.method5451(-120);
            if (arg0) {
               this.method3294(59, -109);
            }
         }

         ++field6599;
         class748 var3 = this.field6603;
         synchronized(this.field6603) {
            this.field6603.method5451(-120);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6606[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method3292(int arg0, byte arg1, int arg2) {
      try {
         ++field6597;
         if (arg1 >= 48) {
            this.field6602 = new class748(arg0);
            this.field6603 = new class748(arg2);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6606[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(II)Lhja;"
   )
   public final class426 method3293(int arg0, int arg1) {
      try {
         ++field6601;
         class748 var3 = this.field6602;
         class426 var4;
         synchronized(this.field6602) {
            var4 = (class426)this.field6602.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field6596;
            byte[] var6;
            synchronized(this.field6596) {
               var6 = this.field6596.method3899(arg0 + -27814, arg1, 36);
            }

            class426 var7 = new class426();
            var7.field6517 = this;
            var7.field6510 = arg1;
            if (arg0 != 27767) {
               return null;
            } else {
               if (var6 != null) {
                  var7.method3246(new class128(var6), (byte)-97);
               }

               var7.method3243(120);
               class748 var8 = this.field6602;
               synchronized(this.field6602) {
                  this.field6602.method5455(-2049, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6606[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3294(int arg0, int arg1) {
      try {
         ++field6595;
         class748 var3 = this.field6602;
         synchronized(this.field6602) {
            this.field6602.method5453(arg0, false);
         }

         if (arg1 != 22379) {
            this.field6600 = null;
         }

         class748 var4 = this.field6603;
         synchronized(this.field6603) {
            this.field6603.method5453(arg0, false);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6606[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;)V"
   )
   public class432(class24 arg0, int arg1, class526 arg2, class526 arg3) {
      try {
         this.field6600 = arg3;
         this.field6596 = arg2;
         this.field6596.method3875(0, 36);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6606[9] + (arg0 != null ? field6606[4] : field6606[5]) + ',' + arg1 + ',' + (arg2 != null ? field6606[4] : field6606[5]) + ',' + (arg3 != null ? field6606[4] : field6606[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3295(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3296(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
