package deob;

@ObfuscatedName("RUPQNTVM")
public class RUPQNTVM {

	@ObfuscatedName("RUPQNTVM.h")
	public int field1126 = 0;

	@ObfuscatedName("RUPQNTVM.i")
	public int field1127 = 0;

	@ObfuscatedName("RUPQNTVM.j")
	public int field1128;

	@ObfuscatedName("RUPQNTVM.k")
	public int field1129;

	@ObfuscatedName("RUPQNTVM.l")
	public int[][] field1130;

	public RUPQNTVM(int arg0, int arg1) {
		field1128 = arg1;
		field1129 = arg0;
		field1130 = new int[field1128][field1129];
		method483();
	}

	@ObfuscatedName("RUPQNTVM.a()V")
	public void method483() {
		for (int var1 = 0; var1 < field1128; var1++) {
			for (int var2 = 0; var2 < field1129; var2++) {
				if (var1 == 0 || var2 == 0 || field1128 - 1 == var1 || field1129 - 1 == var2) {
					field1130[var1][var2] = 0xFFFFFF;
				} else {
					field1130[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("RUPQNTVM.a(IIZZII)V")
	public void method484(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg0 -= field1126;
		arg4 -= field1127;
		if (arg3 == 0) {
			if (arg1 == 0) {
				method487(arg0, arg4, 128);
				method487(arg0 - 1, arg4, 8);
			}

			if (arg1 == 1) {
				method487(arg0, arg4, 2);
				method487(arg0, arg4 + 1, 32);
			}

			if (arg1 == 2) {
				method487(arg0, arg4, 8);
				method487(arg0 + 1, arg4, 128);
			}

			if (arg1 == 3) {
				method487(arg0, arg4, 32);
				method487(arg0, arg4 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg1 == 0) {
				method487(arg0, arg4, 1);
				method487(arg0 - 1, arg4 + 1, 16);
			}

			if (arg1 == 1) {
				method487(arg0, arg4, 4);
				method487(arg0 + 1, arg4 + 1, 64);
			}

			if (arg1 == 2) {
				method487(arg0, arg4, 16);
				method487(arg0 + 1, arg4 - 1, 1);
			}

			if (arg1 == 3) {
				method487(arg0, arg4, 64);
				method487(arg0 - 1, arg4 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg1 == 0) {
				method487(arg0, arg4, 130);
				method487(arg0 - 1, arg4, 8);
				method487(arg0, arg4 + 1, 32);
			}

			if (arg1 == 1) {
				method487(arg0, arg4, 10);
				method487(arg0, arg4 + 1, 32);
				method487(arg0 + 1, arg4, 128);
			}

			if (arg1 == 2) {
				method487(arg0, arg4, 40);
				method487(arg0 + 1, arg4, 128);
				method487(arg0, arg4 - 1, 2);
			}

			if (arg1 == 3) {
				method487(arg0, arg4, 160);
				method487(arg0, arg4 - 1, 2);
				method487(arg0 - 1, arg4, 8);
			}
		}

		if (arg2) {
			if (arg3 == 0) {
				if (arg1 == 0) {
					method487(arg0, arg4, 0x10000);
					method487(arg0 - 1, arg4, 4096);
				}

				if (arg1 == 1) {
					method487(arg0, arg4, 1024);
					method487(arg0, arg4 + 1, 16384);
				}

				if (arg1 == 2) {
					method487(arg0, arg4, 4096);
					method487(arg0 + 1, arg4, 0x10000);
				}

				if (arg1 == 3) {
					method487(arg0, arg4, 16384);
					method487(arg0, arg4 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg1 == 0) {
					method487(arg0, arg4, 512);
					method487(arg0 - 1, arg4 + 1, 8192);
				}

				if (arg1 == 1) {
					method487(arg0, arg4, 2048);
					method487(arg0 + 1, arg4 + 1, 32768);
				}

				if (arg1 == 2) {
					method487(arg0, arg4, 8192);
					method487(arg0 + 1, arg4 - 1, 512);
				}

				if (arg1 == 3) {
					method487(arg0, arg4, 32768);
					method487(arg0 - 1, arg4 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg1 == 0) {
					method487(arg0, arg4, 66560);
					method487(arg0 - 1, arg4, 4096);
					method487(arg0, arg4 + 1, 16384);
				}

				if (arg1 == 1) {
					method487(arg0, arg4, 5120);
					method487(arg0, arg4 + 1, 16384);
					method487(arg0 + 1, arg4, 0x10000);
				}

				if (arg1 == 2) {
					method487(arg0, arg4, 20480);
					method487(arg0 + 1, arg4, 0x10000);
					method487(arg0, arg4 - 1, 1024);
				}

				if (arg1 == 3) {
					method487(arg0, arg4, 81920);
					method487(arg0, arg4 - 1, 1024);
					method487(arg0 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("RUPQNTVM.a(IIZIIII)V")
	public void method485(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg0 -= field1126;
		arg5 -= field1127;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg1;
			arg1 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg1; var9++) {
			if (var9 >= 0 && var9 < field1128) {
				for (int var10 = arg5; var10 < arg4 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1129) {
						method487(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("RUPQNTVM.a(IZI)V")
	public void method486(int arg0, int arg1) {
		arg0 -= field1126;
		arg1 -= field1127;
		field1130[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("RUPQNTVM.a(III)V")
	public void method487(int arg0, int arg1, int arg2) {
		field1130[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("RUPQNTVM.a(IIIZII)V")
	public void method488(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg1 -= field1126;
		arg2 -= field1127;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method490(arg1, arg2, 128);
				method490(arg1 - 1, arg2, 8);
			}

			if (arg4 == 1) {
				method490(arg1, arg2, 2);
				method490(arg1, arg2 + 1, 32);
			}

			if (arg4 == 2) {
				method490(arg1, arg2, 8);
				method490(arg1 + 1, arg2, 128);
			}

			if (arg4 == 3) {
				method490(arg1, arg2, 32);
				method490(arg1, arg2 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method490(arg1, arg2, 1);
				method490(arg1 - 1, arg2 + 1, 16);
			}

			if (arg4 == 1) {
				method490(arg1, arg2, 4);
				method490(arg1 + 1, arg2 + 1, 64);
			}

			if (arg4 == 2) {
				method490(arg1, arg2, 16);
				method490(arg1 + 1, arg2 - 1, 1);
			}

			if (arg4 == 3) {
				method490(arg1, arg2, 64);
				method490(arg1 - 1, arg2 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method490(arg1, arg2, 130);
				method490(arg1 - 1, arg2, 8);
				method490(arg1, arg2 + 1, 32);
			}

			if (arg4 == 1) {
				method490(arg1, arg2, 10);
				method490(arg1, arg2 + 1, 32);
				method490(arg1 + 1, arg2, 128);
			}

			if (arg4 == 2) {
				method490(arg1, arg2, 40);
				method490(arg1 + 1, arg2, 128);
				method490(arg1, arg2 - 1, 2);
			}

			if (arg4 == 3) {
				method490(arg1, arg2, 160);
				method490(arg1, arg2 - 1, 2);
				method490(arg1 - 1, arg2, 8);
			}
		}

		if (arg3) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method490(arg1, arg2, 0x10000);
					method490(arg1 - 1, arg2, 4096);
				}

				if (arg4 == 1) {
					method490(arg1, arg2, 1024);
					method490(arg1, arg2 + 1, 16384);
				}

				if (arg4 == 2) {
					method490(arg1, arg2, 4096);
					method490(arg1 + 1, arg2, 0x10000);
				}

				if (arg4 == 3) {
					method490(arg1, arg2, 16384);
					method490(arg1, arg2 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method490(arg1, arg2, 512);
					method490(arg1 - 1, arg2 + 1, 8192);
				}

				if (arg4 == 1) {
					method490(arg1, arg2, 2048);
					method490(arg1 + 1, arg2 + 1, 32768);
				}

				if (arg4 == 2) {
					method490(arg1, arg2, 8192);
					method490(arg1 + 1, arg2 - 1, 512);
				}

				if (arg4 == 3) {
					method490(arg1, arg2, 32768);
					method490(arg1 - 1, arg2 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method490(arg1, arg2, 66560);
					method490(arg1 - 1, arg2, 4096);
					method490(arg1, arg2 + 1, 16384);
				}

				if (arg4 == 1) {
					method490(arg1, arg2, 5120);
					method490(arg1, arg2 + 1, 16384);
					method490(arg1 + 1, arg2, 0x10000);
				}

				if (arg4 == 2) {
					method490(arg1, arg2, 20480);
					method490(arg1 + 1, arg2, 0x10000);
					method490(arg1, arg2 - 1, 1024);
				}

				if (arg4 == 3) {
					method490(arg1, arg2, 81920);
					method490(arg1, arg2 - 1, 1024);
					method490(arg1 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("RUPQNTVM.a(IIBIIIZ)V")
	public void method489(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field1126;
		arg3 -= field1127;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg1;
			arg1 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg4; var9 < arg1 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1128) {
				for (int var10 = arg3; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1129) {
						method490(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("RUPQNTVM.a(IIII)V")
	public void method490(int arg0, int arg1, int arg2) {
		field1130[arg0][arg1] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("RUPQNTVM.b(IZI)V")
	public void method491(int arg0, int arg1) {
		arg0 -= field1126;
		arg1 -= field1127;
		field1130[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("RUPQNTVM.a(IIIIIIZ)Z")
	public boolean method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg5 && arg3 == arg4) {
			return true;
		}

		arg5 -= field1126;
		arg4 -= field1127;
		arg0 -= field1126;
		arg3 -= field1127;
		if (arg2 == 0) {
			if (arg1 == 0) {
				if (arg0 - 1 == arg5 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4 && (field1130[arg5][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4 && (field1130[arg5][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg5 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg0 + 1 == arg5 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4 && (field1130[arg5][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4 && (field1130[arg5][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg5 && arg3 - 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg1 == 0) {
				if (arg0 - 1 == arg5 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4 && (field1130[arg5][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 - 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4 && (field1130[arg5][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg0 - 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4 && (field1130[arg5][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 - 1 == arg5 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg5 && arg3 + 1 == arg4 && (field1130[arg5][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg5 && arg3 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg0 == arg5 && arg3 + 1 == arg4 && (field1130[arg5][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg5 && arg3 - 1 == arg4 && (field1130[arg5][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg5 && arg3 == arg4 && (field1130[arg5][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("RUPQNTVM.a(ZIIIIII)Z")
	public boolean method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg3 && arg2 == arg5) {
			return true;
		}

		arg3 -= field1126;
		arg5 -= field1127;
		arg1 -= field1126;
		arg2 -= field1127;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg1 + 1 == arg3 && arg2 == arg5 && (field1130[arg3][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg5 && (field1130[arg3][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 - 1 == arg3 && arg2 == arg5 && (field1130[arg3][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 - 1 == arg5 && (field1130[arg3][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 - 1 == arg3 && arg2 == arg5 && (field1130[arg3][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg5 && (field1130[arg3][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 + 1 == arg3 && arg2 == arg5 && (field1130[arg3][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg3 && arg2 + 1 == arg5 && (field1130[arg3][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg1 == arg3 && arg2 + 1 == arg5 && (field1130[arg3][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg3 && arg2 - 1 == arg5 && (field1130[arg3][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg3 && arg2 == arg5 && (field1130[arg3][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg3 && arg2 == arg5 && (field1130[arg3][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("RUPQNTVM.a(IIIIIIII)Z")
	public boolean method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg5 - 1;
		int var9 = arg0 + arg4 - 1;
		if (arg3 >= arg5 && arg3 <= var8 && arg1 >= arg4 && arg1 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg3 && arg1 >= arg4 && arg1 <= var9 && (field1130[arg3 - field1126][arg1 - field1127] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg1 >= arg4 && arg1 <= var9 && (field1130[arg3 - field1126][arg1 - field1127] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg1 && arg3 >= arg5 && arg3 <= var8 && (field1130[arg3 - field1126][arg1 - field1127] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg1 && arg3 >= arg5 && arg3 <= var8 && (field1130[arg3 - field1126][arg1 - field1127] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
