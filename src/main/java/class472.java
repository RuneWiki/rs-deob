import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class472 extends class294 {
   @OriginalMember(
      owner = "client!oha",
      name = "n",
      descriptor = "I"
   )
   public int field7176;
   @OriginalMember(
      owner = "client!oha",
      name = "o",
      descriptor = "I"
   )
   public int field7175;
   @OriginalMember(
      owner = "client!oha",
      name = "t",
      descriptor = "[Z"
   )
   public boolean[] field7181;
   @OriginalMember(
      owner = "client!oha",
      name = "r",
      descriptor = "[I"
   )
   public int[] field7179;
   @OriginalMember(
      owner = "client!oha",
      name = "q",
      descriptor = "[I"
   )
   public int[] field7182;
   @OriginalMember(
      owner = "client!oha",
      name = "u",
      descriptor = "[[I"
   )
   public int[][] field7180;
   @OriginalMember(
      owner = "client!oha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7184 = new String[]{method3672(method3671("U\u0005\\!")), method3672(method3671("T\u0018Qc\u001aR\u001eY9\u0018\u0013")), method3672(method3671("@^\u001ec[")), method3672(method3671("T\u0018Qcd\u0013")), method3672(method3671("T\u0018Qcg\u0013")), method3672(method3671("_\u001a"))};
   @OriginalMember(
      owner = "client!oha",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field7178 = new int[500];
   @OriginalMember(
      owner = "client!oha",
      name = "m",
      descriptor = "I"
   )
   public static int field7177;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oha",
      name = "s",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7183;

   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3668(int arg0) {
      try {
         field7178 = null;
         if (arg0 != 4) {
            method3668(90);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7184[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method3669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg0 < 3) {
            field7178 = null;
         }

         ++field7177;
         if (~arg1 <= -1 && ~arg3 <= -1 && ~arg1 > ~(class513.field7828 + -1) && ~(class475.field7230 - 1) < ~arg3) {
            if (class711.field10694 == null) {
               return;
            }

            if (arg2 != 0) {
               if (~arg2 == -2) {
                  class434 var8 = (class434)class353.method2831(arg6, arg1, arg3);
                  if (var8 != null) {
                     if (!(var8 instanceof class640)) {
                        int var9 = var8.method236((byte)-11);
                        if (arg5 != 4 && ~arg5 != -6) {
                           if (~arg5 != -7) {
                              if (arg5 != 7) {
                                 if (arg5 == 8) {
                                    class101.method980((byte)106, arg6, arg3, arg2, var9, arg1, arg7, arg4 - -4, 4);
                                    class101.method980((byte)106, arg6, arg3, arg2, var9, arg1, arg7, (arg4 + 2 & 3) + 4, 4);
                                    return;
                                 }
                              } else {
                                 class101.method980((byte)106, arg6, arg3, arg2, var9, arg1, arg7, (arg4 + 2 & 3) + 4, 4);
                              }

                              return;
                           }

                           class101.method980((byte)106, arg6, arg3, arg2, var9, arg1, arg7, arg4 + 4, 4);
                           return;
                        }

                        class101.method980((byte)106, arg6, arg3, arg2, var9, arg1, arg7, arg4, 4);
                        return;
                     }

                     ((class640)var8).field9260.method4024((byte)55, arg7);
                     return;
                  }
               } else if (arg2 != 2) {
                  if (~arg2 == -4) {
                     class434 var10 = (class434)class269.method2302(arg6, arg1, arg3);
                     if (var10 != null) {
                        if (var10 instanceof class423) {
                           ((class423)var10).field6519.method4024((byte)55, arg7);
                           return;
                        }

                        class101.method980((byte)106, arg6, arg3, arg2, var10.method236((byte)-11), arg1, arg7, arg4, arg5);
                        return;
                     }
                  }
               } else {
                  class434 var11 = (class434)class288.method2404(arg6, arg1, arg3, field7183 != null ? field7183 : (field7183 = method3670(field7184[5])));
                  if (var11 == null) {
                     return;
                  }

                  if (~arg5 == -12) {
                     arg5 = 10;
                  }

                  if (!(var11 instanceof class32)) {
                     class101.method980((byte)106, arg6, arg3, arg2, var11.method236((byte)-11), arg1, arg7, arg4, arg5);
                     return;
                  }

                  ((class32)var11).field389.method4024((byte)55, arg7);
               }

               return;
            }

            class434 var12 = (class434)class471.method3661(arg6, arg1, arg3);
            class434 var13 = (class434)class288.method2419(arg6, arg1, arg3);
            if (var12 != null && arg5 != 2) {
               label112: {
                  if (!(var12 instanceof class348)) {
                     class101.method980((byte)106, arg6, arg3, arg2, var12.method236((byte)-11), arg1, arg7, arg4, arg5);
                     if (!client.field1786) {
                        break label112;
                     }
                  }

                  ((class348)var12).field5336.method4024((byte)55, arg7);
               }
            }

            if (var13 != null) {
               if (var13 instanceof class348) {
                  ((class348)var13).field5336.method4024((byte)55, arg7);
                  return;
               }

               class101.method980((byte)106, arg6, arg3, arg2, var13.method236((byte)-11), arg1, arg7, arg4, arg5);
               return;
            }
         }

      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field7184[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oha",
      name = "<init>",
      descriptor = "(I[B)V"
   )
   public class472(int arg0, byte[] arg1) {
      boolean var3 = client.field1786;
      super();

      try {
         this.field7176 = arg0;
         class354 var4 = new class354(arg1);
         this.field7175 = var4.method2855(-31007);
         this.field7181 = new boolean[this.field7175];
         this.field7179 = new int[this.field7175];
         this.field7182 = new int[this.field7175];
         this.field7180 = new int[this.field7175][];
         int var5 = 0;
         if (var3) {
            this.field7182[var5] = var4.method2855(-31007);
            if (~this.field7182[var5] == -7) {
               this.field7182[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (var5 >= this.field7175) {
               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     this.field7181[var6] = ~var4.method2855(-31007) == -2;
                     ++var6;
                  }

                  while(true) {
                     while(~this.field7175 < ~var6) {
                        this.field7181[var6] = ~var4.method2855(-31007) == -2;
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           this.field7179[var7] = var4.method2848(-105);
                           ++var7;
                        }

                        while(true) {
                           while(this.field7175 > var7) {
                              this.field7179[var7] = var4.method2848(-105);
                              ++var7;
                           }

                           int var8 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field7180[var8] = new int[var4.method2855(-31007)];
                                 ++var8;
                              }

                              while(true) {
                                 while(this.field7175 > var8) {
                                    this.field7180[var8] = new int[var4.method2855(-31007)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (!var3) {
                                    if (!var3 && ~var9 <= ~this.field7175) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3) {
                                          this.field7180[var9][var10] = var4.method2855(-31007);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(~this.field7180[var9].length < ~var10) {
                                             this.field7180[var9][var10] = var4.method2855(-31007);
                                             ++var10;
                                          }

                                          if (!var3) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(~var9 > ~this.field7175);

                                    return;
                                 }

                                 ++var8;
                              }
                           }

                           ++var7;
                        }
                     }

                     ++var6;
                  }
               }
            } else {
               this.field7182[var5] = var4.method2855(-31007);
            }

            if (~this.field7182[var5] == -7) {
               this.field7182[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field7184[1] + arg0 + ',' + (arg1 != null ? field7184[2] : field7184[0]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!oha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3670(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!oha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3671(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3672(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
