import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class731 {
   @OriginalMember(
      owner = "client!um",
      name = "g",
      descriptor = "Llj;"
   )
   private class304 field10906 = new class304(64);
   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "I"
   )
   public int field10915 = 0;
   @OriginalMember(
      owner = "client!um",
      name = "d",
      descriptor = "Lrr;"
   )
   private class678 field10912;
   @OriginalMember(
      owner = "client!um",
      name = "i",
      descriptor = "I"
   )
   public int field10914;
   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10916 = new String[]{method5395(method5394("\u00013\\K8")), method5395(method5394("\u00013\\N8")), method5395(method5394("\u000fp\\#m")), method5395(method5394("\u00013\\1y\u001a7\u000638")), method5395(method5394("\u001a+\u001ea")), method5395(method5394("\u00013\\O8")), method5395(method5394("\u00013\\L8")), method5395(method5394("\u00013\\H8")), method5395(method5394("\u00013\\I8"))};
   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "I"
   )
   public static int field10911 = -1;
   @OriginalMember(
      owner = "client!um",
      name = "k",
      descriptor = "I"
   )
   public static int field10907;
   @OriginalMember(
      owner = "client!um",
      name = "h",
      descriptor = "I"
   )
   public static int field10908;
   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "I"
   )
   public static int field10909;
   @OriginalMember(
      owner = "client!um",
      name = "e",
      descriptor = "I"
   )
   public static int field10910;
   @OriginalMember(
      owner = "client!um",
      name = "j",
      descriptor = "I"
   )
   public static int field10913;
   @OriginalMember(
      owner = "client!um",
      name = "f",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field10905;

   @OriginalMember(
      owner = "client!um",
      name = "c",
      descriptor = "(I)V",
      line = 6
   )
   public final void method5388(int arg0) {
      try {
         class304 var2 = this.field10906;
         synchronized(this.field10906) {
            this.field10906.method2551(true);
         }

         if (arg0 >= 56) {
            ++field10908;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10916[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(I)V",
      line = 23
   )
   public final void method5389(int arg0) {
      try {
         ++field10910;
         class304 var2 = this.field10906;
         synchronized(this.field10906) {
            if (arg0 == 0) {
               this.field10906.method2554(-120);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10916[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(ZI)V",
      line = 36
   )
   public final void method5390(boolean arg0, int arg1) {
      try {
         ++field10907;
         class304 var3 = this.field10906;
         synchronized(this.field10906) {
            if (arg0) {
               field10911 = -107;
            }

            this.field10906.method2552(arg1, 21533);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10916[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(BI)V",
      line = 50
   )
   public static final void method5391(byte arg0, int arg1) {
      try {
         ++field10913;
         class566 var2 = class146.method1321((long)arg1, 14, -1428737160);
         var2.method4268(4);
         if (arg0 < 37) {
            method5391((byte)-77, -76);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10916[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(BI)Lll;",
      line = 63
   )
   public final class634 method5392(byte arg0, int arg1) {
      try {
         ++field10909;
         class304 var3 = this.field10906;
         class634 var4;
         synchronized(this.field10906) {
            var4 = (class634)this.field10906.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field10912;
            byte[] var6;
            synchronized(this.field10912) {
               var6 = this.field10912.method5017(4, arg1, (byte)71);
            }

            class634 var7 = new class634();
            var7.field9182 = arg1;
            if (arg0 != 45) {
               return null;
            } else {
               var7.field9176 = this;
               if (var6 != null) {
                  var7.method4636(new class354(var6), 0);
               }

               var7.method4634(-110);
               class304 var8 = this.field10906;
               synchronized(this.field10906) {
                  this.field10906.method2545((long)arg1, 122, var7);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10916[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "b",
      descriptor = "(I)V",
      line = 96
   )
   public static void method5393(int arg0) {
      try {
         field10905 = null;
         if (arg0 <= 82) {
            field10905 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10916[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 118
   )
   public class731(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field10912 = arg2;
         this.field10914 = this.field10912.method4998((byte)-82, 4);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10916[3] + (arg0 != null ? field10916[2] : field10916[4]) + ',' + arg1 + ',' + (arg2 != null ? field10916[2] : field10916[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5394(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5395(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
