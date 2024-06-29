import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class786 {
   @OriginalMember(
      owner = "client!lr",
      name = "e",
      descriptor = "Loi;"
   )
   private class80 field11539 = new class80(128);
   @OriginalMember(
      owner = "client!lr",
      name = "j",
      descriptor = "Loi;"
   )
   public class80 field11545 = new class80(64);
   @OriginalMember(
      owner = "client!lr",
      name = "g",
      descriptor = "Lkf;"
   )
   private class266 field11535;
   @OriginalMember(
      owner = "client!lr",
      name = "i",
      descriptor = "Lkf;"
   )
   public class266 field11536;
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11547 = new String[]{method5674(method5673("5\u007f6\u0018<")), method5674(method5673("5\u007f6\u001b<")), method5674(method5673("\"#6ri")), method5674(method5673("7xt0")), method5674(method5673("5\u007f6`}7dlb<")), method5674(method5673("5\u007f6\u001a<")), method5674(method5673("5\u007f6\u001e<")), method5674(method5673("5\u007f6\u001d<")), method5674(method5673("5\u007f6\u0019<")), method5674(method5673("5\u007f6\u001f<"))};
   @OriginalMember(
      owner = "client!lr",
      name = "h",
      descriptor = "Leg;"
   )
   public static class118 field11534 = new class118(10, 12);
   @OriginalMember(
      owner = "client!lr",
      name = "f",
      descriptor = "Lqea;"
   )
   public static class139 field11543 = new class139();
   @OriginalMember(
      owner = "client!lr",
      name = "m",
      descriptor = "I"
   )
   public static int field11537;
   @OriginalMember(
      owner = "client!lr",
      name = "l",
      descriptor = "I"
   )
   public static int field11538;
   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "I"
   )
   public static int field11540;
   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "I"
   )
   public static int field11541;
   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "I"
   )
   public static int field11542;
   @OriginalMember(
      owner = "client!lr",
      name = "k",
      descriptor = "I"
   )
   public static int field11544;
   @OriginalMember(
      owner = "client!lr",
      name = "d",
      descriptor = "I"
   )
   public static int field11546;

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IZ)Ldja;"
   )
   public final class326 method5666(int arg0, boolean arg1) {
      try {
         ++field11542;
         class80 var3 = this.field11539;
         class326 var4;
         synchronized(this.field11539) {
            var4 = (class326)this.field11539.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else if (arg1) {
            return null;
         } else {
            class266 var5 = this.field11535;
            byte[] var6;
            synchronized(this.field11535) {
               var6 = this.field11535.method2037(arg1, arg0, 36);
            }

            class326 var7 = new class326();
            var7.field4421 = arg0;
            var7.field4450 = this;
            if (var6 != null) {
               var7.method2419(new class147(var6), (byte)-43);
            }

            var7.method2411((byte)87);
            class80 var8 = this.field11539;
            synchronized(this.field11539) {
               this.field11539.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field11547[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5667(byte arg0) {
      try {
         int var2 = 117 / ((arg0 - 42) / 48);
         ++field11540;
         class80 var3 = this.field11539;
         synchronized(this.field11539) {
            this.field11539.method731(0);
         }

         class80 var4 = this.field11545;
         synchronized(this.field11545) {
            this.field11545.method731(0);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11547[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method5668(int arg0, int arg1, int arg2) {
      try {
         this.field11539 = new class80(arg1);
         ++field11537;
         if (arg0 != 12938) {
            this.field11535 = null;
         }

         this.field11545 = new class80(arg2);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11547[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method5669(int arg0, byte arg1) {
      try {
         class80 var3 = this.field11539;
         synchronized(this.field11539) {
            this.field11539.method726(arg0, 25324);
         }

         ++field11538;
         class80 var4 = this.field11545;
         synchronized(this.field11545) {
            if (arg1 == -78) {
               this.field11545.method726(arg0, 25324);
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11547[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5670(int arg0) {
      try {
         field11543 = null;
         field11534 = null;
         if (arg0 > -64) {
            field11546 = -118;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11547[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5671(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field11544;
         if (class635.method4596(arg0, 28505)) {
            class678[] var3 = class547.field7851[arg0];
            int var4 = arg1;
            if (var2 || var3.length > arg1) {
               do {
                  class678 var5 = var3[var4];
                  if (var5 != null) {
                     var5.field9862 = 0;
                     var5.field9869 = 1;
                     var5.field9886 = 0;
                  }

                  ++var4;
               } while(var3.length > var4);

            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11547[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5672(int arg0) {
      try {
         class80 var2 = this.field11539;
         synchronized(this.field11539) {
            this.field11539.method715(true);
            if (arg0 != 36) {
               this.field11545 = null;
            }
         }

         ++field11541;
         class80 var3 = this.field11545;
         synchronized(this.field11545) {
            this.field11545.method715(true);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11547[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;)V"
   )
   public class786(class732 arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         this.field11535 = arg2;
         this.field11536 = arg3;
         this.field11535.method2060(2, 36);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11547[4] + (arg0 != null ? field11547[2] : field11547[3]) + ',' + arg1 + ',' + (arg2 != null ? field11547[2] : field11547[3]) + ',' + (arg3 != null ? field11547[2] : field11547[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5673(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5674(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
