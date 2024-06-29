import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class750 {
   @OriginalMember(
      owner = "client!nk",
      name = "d",
      descriptor = "Lkda;"
   )
   private class411 field10907 = new class411();
   @OriginalMember(
      owner = "client!nk",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field10905;
   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10918 = new String[]{method5427(method5426(",<j\nl")), method5427(method5426("9g(H")), method5427(method5426("9yjl9")), method5427(method5426("9yjf9")), method5427(method5426("9yjg9")), method5427(method5426("9yje9")), method5427(method5426("9yj\u0018x9{0\u001a9")), method5427(method5426("9yjb9")), method5427(method5426("9yjc9")), method5427(method5426("9yja9")), method5427(method5426("9yj`9"))};
   @OriginalMember(
      owner = "client!nk",
      name = "m",
      descriptor = "Lo;"
   )
   public static class31 field10915 = new class31(4, 7);
   @OriginalMember(
      owner = "client!nk",
      name = "f",
      descriptor = "I"
   )
   public static int field10917 = 0;
   @OriginalMember(
      owner = "client!nk",
      name = "e",
      descriptor = "I"
   )
   public static int field10904;
   @OriginalMember(
      owner = "client!nk",
      name = "h",
      descriptor = "I"
   )
   public static int field10906;
   @OriginalMember(
      owner = "client!nk",
      name = "g",
      descriptor = "I"
   )
   public static int field10908;
   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "I"
   )
   public static int field10909;
   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "I"
   )
   public static int field10910;
   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "I"
   )
   private volatile int field10912;
   @OriginalMember(
      owner = "client!nk",
      name = "i",
      descriptor = "I"
   )
   public static int field10913;
   @OriginalMember(
      owner = "client!nk",
      name = "n",
      descriptor = "I"
   )
   public static int field10914;
   @OriginalMember(
      owner = "client!nk",
      name = "l",
      descriptor = "Lifa;"
   )
   private class453 field10911;
   @OriginalMember(
      owner = "client!nk",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field10916;

   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "(I)Lql;"
   )
   public final class770 method5418(int arg0) {
      try {
         ++field10908;
         Object var2 = null;
         class411 var3 = this.field10907;
         class770 var4;
         synchronized(this.field10907) {
            var4 = this.field10907.method3110(-124);
            var4.method5512((byte)-113);
            --this.field10912;
         }

         if (arg0 != 0) {
            field10917 = 59;
         }

         return var4;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10918[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Lu;B)V"
   )
   public final void method5419(class80 arg0, byte arg1) {
      try {
         arg0.field997 = true;
         int var3 = 118 % ((-81 - arg1) / 39);
         ++field10910;
         class411 var4 = this.field10907;
         synchronized(this.field10907) {
            this.field10907.method3116(arg0, 84);
            ++this.field10912;
         }

         if (this.field10911 != null) {
            class453 var5 = this.field10911;
            synchronized(this.field10911) {
               this.field10911.notify();
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10918[2] + (arg0 != null ? field10918[0] : field10918[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Lpm;Z)V"
   )
   public final void method5420(class614 arg0, boolean arg1) {
      try {
         if (arg1) {
            ++field10914;
            class411 var3 = this.field10907;
            synchronized(this.field10907) {
               this.field10907.method3116(arg0, -115);
               ++this.field10912;
            }

            if (this.field10911 != null) {
               class453 var4 = this.field10911;
               synchronized(this.field10911) {
                  this.field10911.notify();
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10918[9] + (arg0 != null ? field10918[0] : field10918[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5421(int arg0) {
      try {
         if (arg0 != 0) {
            method5424((class372)null, 94, (byte[][])null);
         }

         field10916 = null;
         field10915 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10918[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method5422(int arg0) {
      try {
         if (arg0 != 0) {
            field10916 = null;
         }

         ++field10906;
         return ~this.field10912 == -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10918[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(BLifa;)V"
   )
   public final void method5423(byte arg0, class453 arg1) {
      try {
         ++field10913;
         int var3 = -74 / ((arg0 - -74) / 38);
         this.field10911 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10918[8] + arg0 + ',' + (arg1 != null ? field10918[0] : field10918[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Lrq;I[[B)V"
   )
   public static final void method5424(class372 param0, int param1, byte[][] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(BLu;)V"
   )
   public final void method5425(byte arg0, class80 arg1) {
      try {
         ++field10909;
         arg1.field997 = false;
         int var3 = -24 % ((arg0 - 21) / 37);
         class411 var4 = this.field10907;
         synchronized(this.field10907) {
            this.field10907.method3116(arg1, -83);
            ++this.field10912;
         }

         if (this.field10911 != null) {
            class453 var5 = this.field10911;
            synchronized(this.field10911) {
               this.field10911.notify();
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10918[10] + arg0 + ',' + (arg1 != null ? field10918[0] : field10918[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class750(String arg0) {
      try {
         this.field10905 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10918[6] + (arg0 != null ? field10918[0] : field10918[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5426(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5427(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
