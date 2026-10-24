package deob;

@ObfuscatedName("DYTTVJNT")
public class DYTTVJNT {

	@ObfuscatedName("DYTTVJNT.j")
	public int field678 = 0;

	@ObfuscatedName("DYTTVJNT.k")
	public int field679 = 0;

	@ObfuscatedName("DYTTVJNT.l")
	public int field680;

	@ObfuscatedName("DYTTVJNT.m")
	public int field681;

	@ObfuscatedName("DYTTVJNT.n")
	public int[][] field682;

	public DYTTVJNT(int arg0, int arg1) {
		field680 = arg0;
		field681 = arg1;
		field682 = new int[field680][field681];
		method200();
	}

	@ObfuscatedName("DYTTVJNT.a()V")
	public void method200() {
		for (int var1 = 0; var1 < field680; var1++) {
			for (int var2 = 0; var2 < field681; var2++) {
				if (var1 == 0 || var2 == 0 || field680 - 1 == var1 || field681 - 1 == var2) {
					field682[var1][var2] = 0xFFFFFF;
				} else {
					field682[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("DYTTVJNT.a(ZIIZII)V")
	public void method201(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field678;
		arg4 -= field679;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method204(arg1, arg4, 128);
				method204(arg1 - 1, arg4, 8);
			}

			if (arg3 == 1) {
				method204(arg1, arg4, 2);
				method204(arg1, arg4 + 1, 32);
			}

			if (arg3 == 2) {
				method204(arg1, arg4, 8);
				method204(arg1 + 1, arg4, 128);
			}

			if (arg3 == 3) {
				method204(arg1, arg4, 32);
				method204(arg1, arg4 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method204(arg1, arg4, 1);
				method204(arg1 - 1, arg4 + 1, 16);
			}

			if (arg3 == 1) {
				method204(arg1, arg4, 4);
				method204(arg1 + 1, arg4 + 1, 64);
			}

			if (arg3 == 2) {
				method204(arg1, arg4, 16);
				method204(arg1 + 1, arg4 - 1, 1);
			}

			if (arg3 == 3) {
				method204(arg1, arg4, 64);
				method204(arg1 - 1, arg4 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method204(arg1, arg4, 130);
				method204(arg1 - 1, arg4, 8);
				method204(arg1, arg4 + 1, 32);
			}

			if (arg3 == 1) {
				method204(arg1, arg4, 10);
				method204(arg1, arg4 + 1, 32);
				method204(arg1 + 1, arg4, 128);
			}

			if (arg3 == 2) {
				method204(arg1, arg4, 40);
				method204(arg1 + 1, arg4, 128);
				method204(arg1, arg4 - 1, 2);
			}

			if (arg3 == 3) {
				method204(arg1, arg4, 160);
				method204(arg1, arg4 - 1, 2);
				method204(arg1 - 1, arg4, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method204(arg1, arg4, 0x10000);
					method204(arg1 - 1, arg4, 4096);
				}

				if (arg3 == 1) {
					method204(arg1, arg4, 1024);
					method204(arg1, arg4 + 1, 16384);
				}

				if (arg3 == 2) {
					method204(arg1, arg4, 4096);
					method204(arg1 + 1, arg4, 0x10000);
				}

				if (arg3 == 3) {
					method204(arg1, arg4, 16384);
					method204(arg1, arg4 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method204(arg1, arg4, 512);
					method204(arg1 - 1, arg4 + 1, 8192);
				}

				if (arg3 == 1) {
					method204(arg1, arg4, 2048);
					method204(arg1 + 1, arg4 + 1, 32768);
				}

				if (arg3 == 2) {
					method204(arg1, arg4, 8192);
					method204(arg1 + 1, arg4 - 1, 512);
				}

				if (arg3 == 3) {
					method204(arg1, arg4, 32768);
					method204(arg1 - 1, arg4 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method204(arg1, arg4, 66560);
					method204(arg1 - 1, arg4, 4096);
					method204(arg1, arg4 + 1, 16384);
				}

				if (arg3 == 1) {
					method204(arg1, arg4, 5120);
					method204(arg1, arg4 + 1, 16384);
					method204(arg1 + 1, arg4, 0x10000);
				}

				if (arg3 == 2) {
					method204(arg1, arg4, 20480);
					method204(arg1 + 1, arg4, 0x10000);
					method204(arg1, arg4 - 1, 1024);
				}

				if (arg3 == 3) {
					method204(arg1, arg4, 81920);
					method204(arg1, arg4 - 1, 1024);
					method204(arg1 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IIZZIII)V")
	public void method202(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg3 -= field678;
		arg5 -= field679;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg3; var9 < arg0 + arg3; var9++) {
			if (var9 >= 0 && var9 < field680) {
				for (int var10 = arg5; var10 < arg1 + arg5; var10++) {
					if (var10 >= 0 && var10 < field681) {
						method204(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("DYTTVJNT.a(III)V")
	public void method203(int arg0, int arg1) {
		arg0 -= field678;
		arg1 -= field679;
		field682[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("DYTTVJNT.b(III)V")
	public void method204(int arg0, int arg1, int arg2) {
		field682[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("DYTTVJNT.a(IIZIII)V")
	public void method205(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field678;
		arg4 -= field679;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method207(128, arg1, arg4);
				method207(8, arg1 - 1, arg4);
			}

			if (arg3 == 1) {
				method207(2, arg1, arg4);
				method207(32, arg1, arg4 + 1);
			}

			if (arg3 == 2) {
				method207(8, arg1, arg4);
				method207(128, arg1 + 1, arg4);
			}

			if (arg3 == 3) {
				method207(32, arg1, arg4);
				method207(2, arg1, arg4 - 1);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method207(1, arg1, arg4);
				method207(16, arg1 - 1, arg4 + 1);
			}

			if (arg3 == 1) {
				method207(4, arg1, arg4);
				method207(64, arg1 + 1, arg4 + 1);
			}

			if (arg3 == 2) {
				method207(16, arg1, arg4);
				method207(1, arg1 + 1, arg4 - 1);
			}

			if (arg3 == 3) {
				method207(64, arg1, arg4);
				method207(4, arg1 - 1, arg4 - 1);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method207(130, arg1, arg4);
				method207(8, arg1 - 1, arg4);
				method207(32, arg1, arg4 + 1);
			}

			if (arg3 == 1) {
				method207(10, arg1, arg4);
				method207(32, arg1, arg4 + 1);
				method207(128, arg1 + 1, arg4);
			}

			if (arg3 == 2) {
				method207(40, arg1, arg4);
				method207(128, arg1 + 1, arg4);
				method207(2, arg1, arg4 - 1);
			}

			if (arg3 == 3) {
				method207(160, arg1, arg4);
				method207(2, arg1, arg4 - 1);
				method207(8, arg1 - 1, arg4);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method207(0x10000, arg1, arg4);
					method207(4096, arg1 - 1, arg4);
				}

				if (arg3 == 1) {
					method207(1024, arg1, arg4);
					method207(16384, arg1, arg4 + 1);
				}

				if (arg3 == 2) {
					method207(4096, arg1, arg4);
					method207(0x10000, arg1 + 1, arg4);
				}

				if (arg3 == 3) {
					method207(16384, arg1, arg4);
					method207(1024, arg1, arg4 - 1);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method207(512, arg1, arg4);
					method207(8192, arg1 - 1, arg4 + 1);
				}

				if (arg3 == 1) {
					method207(2048, arg1, arg4);
					method207(32768, arg1 + 1, arg4 + 1);
				}

				if (arg3 == 2) {
					method207(8192, arg1, arg4);
					method207(512, arg1 + 1, arg4 - 1);
				}

				if (arg3 == 3) {
					method207(32768, arg1, arg4);
					method207(2048, arg1 - 1, arg4 - 1);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method207(66560, arg1, arg4);
					method207(4096, arg1 - 1, arg4);
					method207(16384, arg1, arg4 + 1);
				}

				if (arg3 == 1) {
					method207(5120, arg1, arg4);
					method207(16384, arg1, arg4 + 1);
					method207(0x10000, arg1 + 1, arg4);
				}

				if (arg3 == 2) {
					method207(20480, arg1, arg4);
					method207(0x10000, arg1 + 1, arg4);
					method207(1024, arg1, arg4 - 1);
				}

				if (arg3 == 3) {
					method207(81920, arg1, arg4);
					method207(1024, arg1, arg4 - 1);
					method207(4096, arg1 - 1, arg4);
					return;
				}
			}
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IIIIIIZ)V")
	public void method206(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field678;
		arg0 -= field679;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg1;
			arg1 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg4; var9 < arg1 + arg4; var9++) {
			if (var9 >= 0 && var9 < field680) {
				for (int var10 = arg0; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field681) {
						method207(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("DYTTVJNT.a(IZII)V")
	public void method207(int arg0, int arg1, int arg2) {
		field682[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("DYTTVJNT.a(IZI)V")
	public void method208(int arg0, int arg1) {
		arg0 -= field678;
		arg1 -= field679;
		field682[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("DYTTVJNT.a(IIIZIII)Z")
	public boolean method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg1 && arg3 == arg4) {
			return true;
		}

		arg0 -= field678;
		arg4 -= field679;
		arg1 -= field678;
		arg3 -= field679;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (arg1 - 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4 && (field682[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4 && (field682[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 == arg1 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg1 - 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 + 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4 && (field682[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4 && (field682[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 == arg1 && arg3 - 1 == arg4) {
					return true;
				}

				if (arg1 - 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg5 == 0) {
				if (arg1 - 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4 && (field682[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg1 - 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4 && (field682[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg1 - 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4 && (field682[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg1 - 1 == arg0 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg1 && arg3 + 1 == arg4 && (field682[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg1 && arg3 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg0 == arg1 && arg3 + 1 == arg4 && (field682[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg1 && arg3 - 1 == arg4 && (field682[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg0 && arg3 == arg4 && (field682[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("DYTTVJNT.a(IIIIIII)Z")
	public boolean method210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg1 == arg4) {
			return true;
		}

		arg5 -= field678;
		arg4 -= field679;
		arg3 -= field678;
		arg1 -= field679;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg3 + 1 == arg5 && arg1 == arg4 && (field682[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg4 && (field682[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg3 - 1 == arg5 && arg1 == arg4 && (field682[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 - 1 == arg4 && (field682[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg3 - 1 == arg5 && arg1 == arg4 && (field682[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg4 && (field682[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg3 + 1 == arg5 && arg1 == arg4 && (field682[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg1 + 1 == arg4 && (field682[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg3 == arg5 && arg1 + 1 == arg4 && (field682[arg5][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg1 - 1 == arg4 && (field682[arg5][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg5 && arg1 == arg4 && (field682[arg5][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg5 && arg1 == arg4 && (field682[arg5][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("DYTTVJNT.a(ZIIIIIII)Z")
	public boolean method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg2 + arg5 - 1;
		if (arg4 >= arg0 && arg4 <= var8 && arg1 >= arg2 && arg1 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg4 && arg1 >= arg2 && arg1 <= var9 && (field682[arg4 - field678][arg1 - field679] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg4 && arg1 >= arg2 && arg1 <= var9 && (field682[arg4 - field678][arg1 - field679] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg1 && arg4 >= arg0 && arg4 <= var8 && (field682[arg4 - field678][arg1 - field679] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg4 >= arg0 && arg4 <= var8 && (field682[arg4 - field678][arg1 - field679] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
