import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class612 implements class262 {
   @OriginalMember(
      owner = "client!taa",
      name = "b",
      descriptor = "I"
   )
   public int field8708;
   @OriginalMember(
      owner = "client!taa",
      name = "k",
      descriptor = "I"
   )
   public int field8707;
   @OriginalMember(
      owner = "client!taa",
      name = "g",
      descriptor = "I"
   )
   public int field8712;
   @OriginalMember(
      owner = "client!taa",
      name = "j",
      descriptor = "I"
   )
   public int field8704;
   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "Lmj;"
   )
   public class730 field8709;
   @OriginalMember(
      owner = "client!taa",
      name = "i",
      descriptor = "I"
   )
   public int field8706;
   @OriginalMember(
      owner = "client!taa",
      name = "e",
      descriptor = "I"
   )
   public int field8701;
   @OriginalMember(
      owner = "client!taa",
      name = "f",
      descriptor = "Leu;"
   )
   public class634 field8705;
   @OriginalMember(
      owner = "client!taa",
      name = "h",
      descriptor = "I"
   )
   public int field8703;
   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8714 = new String[]{method4506(method4505("vq=+5*")), method4506(method4505("vq=+Hk~5qJ*")), method4506(method4505("y>r+\t")), method4506(method4505("le0i")), method4506(method4505("vq=+7*"))};
   @OriginalMember(
      owner = "client!taa",
      name = "l",
      descriptor = "I"
   )
   public static int field8702;
   @OriginalMember(
      owner = "client!taa",
      name = "m",
      descriptor = "I"
   )
   public static int field8710;
   @OriginalMember(
      owner = "client!taa",
      name = "c",
      descriptor = "I"
   )
   public static int field8711;
   @OriginalMember(
      owner = "client!taa",
      name = "d",
      descriptor = "I"
   )
   public static int field8713;

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcp;"
   )
   public static final class300 method4503(Throwable arg0, String arg1) {
      ++field8710;
      class300 var2;
      if (!(arg0 instanceof class300)) {
         var2 = new class300(arg0, arg1);
      } else {
         var2 = (class300)arg0;
         var2.field4486 = var2.field4486 + ' ' + arg1;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "([[[Lhs;I)V"
   )
   public static final void method4504(class312[][][] arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg1 >= -82) {
            method4503((Throwable)null, (String)null);
         }

         int var3 = 0;
         if (!var2 && var3 >= arg0.length) {
            ++field8713;
         } else {
            do {
               class312[][] var4 = arg0[var3];
               int var5 = 0;
               if (var2 || ~var4.length < ~var5) {
                  do {
                     int var6 = 0;
                     if (var2 || var6 < var4[var5].length) {
                        do {
                           class312 var7 = var4[var5][var6];
                           if (var7 != null) {
                              if (var7.field4677 instanceof class338) {
                                 ((class338)var7.field4677).method732(9799);
                              }

                              if (var7.field4679 instanceof class338) {
                                 ((class338)var7.field4679).method732(9799);
                                 if (var7.field4690 instanceof class338) {
                                    ((class338)var7.field4690).method732(9799);
                                 }
                              } else if (var7.field4690 instanceof class338) {
                                 ((class338)var7.field4690).method732(9799);
                              }

                              if (var7.field4688 instanceof class338) {
                                 ((class338)var7.field4688).method732(9799);
                                 if (var7.field4689 instanceof class338) {
                                    ((class338)var7.field4689).method732(9799);
                                 }
                              } else if (var7.field4689 instanceof class338) {
                                 ((class338)var7.field4689).method732(9799);
                              }

                              class84 var8 = var7.field4678;
                              if (!var2 && var8 == null) {
                                 ++var6;
                              } else {
                                 do {
                                    class578 var9 = var8.field1299;
                                    if (var9 instanceof class338) {
                                       ((class338)var9).method732(9799);
                                    }

                                    var8 = var8.field1305;
                                 } while(var8 != null);

                                 ++var6;
                              }
                           } else {
                              ++var6;
                           }
                        } while(var6 < var4[var5].length);
                     }

                     ++var5;
                  } while(~var4.length < ~var5);
               }

               ++var3;
            } while(var3 < arg0.length);

            ++field8713;
         }
      } catch (RuntimeException var11) {
         throw method4503(var11, field8714[4] + (arg0 != null ? field8714[2] : field8714[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "<init>",
      descriptor = "(Leu;Lmj;IIIIIII)V"
   )
   public class612(class634 arg0, class730 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field8708 = arg5;
         this.field8707 = arg6;
         this.field8712 = arg2;
         this.field8704 = arg8;
         this.field8709 = arg1;
         this.field8706 = arg7;
         this.field8701 = arg4;
         this.field8705 = arg0;
         this.field8703 = arg3;
      } catch (RuntimeException var11) {
         throw method4503(var11, field8714[1] + (arg0 != null ? field8714[2] : field8714[3]) + ',' + (arg1 != null ? field8714[2] : field8714[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public class577 method108(byte arg0) {
      try {
         if (arg0 >= -70) {
            return null;
         } else {
            ++field8711;
            return null;
         }
      } catch (RuntimeException var3) {
         throw method4503(var3, field8714[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4505(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!taa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4506(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
