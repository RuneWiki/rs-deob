import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class42 {
   @OriginalMember(
      owner = "client!vd",
      name = "g",
      descriptor = "Z"
   )
   public boolean field582;
   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field588 = new String[]{method363(method362("V\u0015n*0N\u00184(q")), method363(method362("V\u0015nTq")), method363(method362("V\u0015nWq")), method363(method362("V\u0015nRq")), method363(method362("V\u0015nUq"))};
   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "J"
   )
   public static long field580 = 0L;
   @OriginalMember(
      owner = "client!vd",
      name = "e",
      descriptor = "I"
   )
   public static int field579 = 4;
   @OriginalMember(
      owner = "client!vd",
      name = "k",
      descriptor = "I"
   )
   public static int field578;
   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "I"
   )
   public static int field581;
   @OriginalMember(
      owner = "client!vd",
      name = "d",
      descriptor = "I"
   )
   public static int field584;
   @OriginalMember(
      owner = "client!vd",
      name = "h",
      descriptor = "I"
   )
   public static int field585;
   @OriginalMember(
      owner = "client!vd",
      name = "i",
      descriptor = "I"
   )
   public static int field587;
   @OriginalMember(
      owner = "client!vd",
      name = "j",
      descriptor = "Lbk;"
   )
   public class398 field577;
   @OriginalMember(
      owner = "client!vd",
      name = "f",
      descriptor = "Lbk;"
   )
   public class398 field586;
   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "Z"
   )
   public boolean field583;

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(IIZ)V",
      line = 10
   )
   public static final void method358(int arg0, int arg1, boolean arg2) {
      try {
         ++field578;
         if (arg1 != -3) {
            field579 = 97;
         }

         class550.method3950((byte)-89, class180.field2491.method1437(class608.field8920, arg1 + 53), arg0, arg2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field588[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(I)Z",
      line = 24
   )
   public final boolean method359(int arg0) {
      try {
         ++field587;
         int var2 = -107 / ((-15 - arg0) / 51);
         return this.field583 && !this.field582;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field588[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(III)Z",
      line = 41
   )
   public static final boolean method360(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field581;
         if (!class131.field1677) {
            return false;
         } else {
            int var4 = arg1 >> 16;
            int var5 = arg1 & 65535;
            if (class547.field7851[var4] != null && class547.field7851[var4][var5] != null) {
               if (arg0 < 83) {
                  return false;
               } else {
                  int var10000;
                  class678 var6;
                  class32 var7;
                  label196: {
                     var6 = class547.field7851[var4][var5];
                     if (~arg2 != 0 || ~var6.field9992 != -1) {
                        var7 = (class32)class627.field9216.method2933(2);
                        if (var3) {
                           if (var7.field457 == arg2 && var6.field9854 == var7.field460 && (~var7.field458 == -3 || ~var7.field458 == -1007 || var7.field458 == 15 || var7.field458 == 48 || ~var7.field458 == -26)) {
                              return true;
                           }

                           var7 = (class32)class627.field9216.method2940(false);
                        }

                        while(true) {
                           while(var7 != null) {
                              if (var7.field457 == arg2 && var6.field9854 == var7.field460 && (~var7.field458 == -3 || ~var7.field458 == -1007 || var7.field458 == 15 || var7.field458 == 48 || ~var7.field458 == -26)) {
                                 return true;
                              }

                              var7 = (class32)class627.field9216.method2940(false);
                           }

                           if (!var3) {
                              if (!var3) {
                                 var10000 = 0;
                                 if (!var3) {
                                    return false;
                                 }
                                 break label196;
                              }
                              break;
                           }

                           var7 = (class32)class627.field9216.method2940(false);
                        }
                     }

                     var7 = (class32)class627.field9216.method2933(2);
                     if (var3) {
                        var10000 = var7.field458;
                     } else if (var7 == null) {
                        var10000 = 0;
                        if (!var3) {
                           return false;
                        }
                     } else {
                        var10000 = var7.field458;
                     }
                  }

                  while(true) {
                     if (var10000 != 2 && ~var7.field458 != -1007 && var7.field458 != 15 && var7.field458 != 48 && var7.field458 != 25) {
                        var7 = (class32)class627.field9216.method2940(false);
                     } else {
                        class678 var8 = class602.method4379((byte)-121, var7.field460);
                        if (var3) {
                           if (~var6.field9854 == ~var8.field9854) {
                              return true;
                           }

                           var8 = class130.method1031(124, var8);
                        }

                        while(var8 != null) {
                           if (~var6.field9854 == ~var8.field9854) {
                              return true;
                           }

                           var8 = class130.method1031(124, var8);
                        }

                        var7 = (class32)class627.field9216.method2940(false);
                     }

                     if (var7 == null) {
                        var10000 = 0;
                        if (!var3) {
                           return false;
                        }
                     } else {
                        var10000 = var7.field458;
                     }
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field588[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "(I)V",
      line = 109
   )
   public final void method361(int arg0) {
      try {
         if (this.field577 != null) {
            this.field577.method1412(55);
         }

         if (arg0 != 15) {
            field580 = 63L;
         }

         ++field585;
         this.field583 = false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field588[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "<init>",
      descriptor = "(Z)V",
      line = 122
   )
   public class42(boolean arg0) {
      try {
         this.field582 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field588[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method362(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method363(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
